package com.bugrui.kotlincodelayout.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.bugrui.kotlincodelayout.R
import com.bugrui.kotlincodelayout.api.APIService
import com.bugrui.kotlincodelayout.dp
import com.bugrui.kotlincodelayout.toast
import com.bugrui.layout._FrameLayout
import com.bugrui.layout.layoutMatchParent
import com.bugrui.layout.setParams
import com.bugrui.refresh.SmartSwipeRefreshLayout
import com.bugrui.refresh.listener.OnSmartRefreshLoadMoreListener
import com.bugrui.request.APIRequest

class MainActivity : AppCompatActivity(), MainAdapter.OnItemClickListener,
    OnSmartRefreshLoadMoreListener {

    private var mSwipeRefreshLayout: SmartSwipeRefreshLayout? = null
    private var mRecyclerView: RecyclerView? = null

    private val mAdapter = MainAdapter()

    private var mPage = 1

    private val rootLayout by lazy {
        _FrameLayout(this).apply {
            setParams(width = layoutMatchParent, height = layoutMatchParent)
            mSwipeRefreshLayout = SmartSwipeRefreshLayout(context).apply {
                mRecyclerView = RecyclerView(context).apply {
                }.lparams(width = layoutMatchParent, height = layoutMatchParent)
                    .also { addView(it) }
            }.lparams(width = layoutMatchParent, height = layoutMatchParent)
                .also { addView(it) }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(rootLayout)
        mRecyclerView?.apply {
            itemAnimator = DefaultItemAnimator()
            addItemDecoration(GridItemDecoration(2, 6.dp, true))
            mAdapter.setOnItemClickListener(this@MainActivity)
            val gridLayoutManager = GridLayoutManager(this@MainActivity, 2)
            layoutManager = gridLayoutManager
            adapter = mAdapter


            mSwipeRefreshLayout?.setPrefetchDistance(35)
            mSwipeRefreshLayout?.setOnRefreshLoadMoreListener(this, this@MainActivity)
            mSwipeRefreshLayout?.autoRefreshing()

        }

    }

    override fun onItemClick(view: ImageView, position: Int) {

    }
    override fun onRefreshing() {
        getList(true)
    }

    override fun onLoadMore() {
        getList(false)
    }

    private val apiService = APIRequest.create(APIService::class.java)

    private fun getList(isRefresh: Boolean) {
        apiService.getData(if (isRefresh) 1 else mPage)
            .observe(this, Observer {
                mSwipeRefreshLayout?.finishRefreshing()
                mSwipeRefreshLayout?.finishLoadingMore()
                if (it.isSuccessful()) {
                    if (isRefresh) {
                        mPage = 2
                        mAdapter.setDatas(it.results)
                        if (mAdapter.mDatas.isNullOrEmpty()) {
                            mSwipeRefreshLayout?.setNoLoadingMoreAll()
                        }
                    } else {
                        mPage++
                        mAdapter.addDatas(it.results)
                        if (it.results.isNullOrEmpty()) {
                            mSwipeRefreshLayout?.finishLoadingMoreAll()
                        }
                    }
                } else {
                    toast(it.msg ?: "")
                }
            })

    }

}