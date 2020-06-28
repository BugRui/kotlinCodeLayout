package com.bugrui.kotlincodelayout.ui

import android.content.Context
import android.util.DisplayMetrics
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bugrui.kotlincodelayout.dp
import com.bugrui.layout._ConstraintLayout
import com.bugrui.layout.layoutMatchParent
import com.bugrui.layout.layoutWrapContent
import com.bugrui.layout.setParams
import com.bugrui.kotlincodelayout.data.Gank
import com.bumptech.glide.Glide

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var mDatas: ArrayList<Gank> = ArrayList()
    private var listener: OnItemClickListener? = null

    fun setDatas(datas: List<Gank>?) {
        mDatas.clear()
        if (datas.isNullOrEmpty()) return
        mDatas.addAll(datas)
        notifyDataSetChanged()
    }

    fun addDatas(datas: List<Gank>?) {
        if (datas.isNullOrEmpty()) return
        val oldSize = mDatas.size as Int
        mDatas.addAll(datas)
        val newSize = mDatas.size as Int
        notifyItemRangeInserted(oldSize, newSize)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var imageView: ImageView
        val container = _ConstraintLayout(parent.context).apply {
            setParams(width = layoutMatchParent, height = layoutWrapContent)
            CardView(context).apply {

                imageView = ImageView(context).apply {
                    scaleType = ImageView.ScaleType.CENTER_CROP
                }.lparams(width = layoutMatchParent, height = layoutMatchParent)
                    .also { addView(it) }

            }.lparams(width = 0, height = 240.dp) {
                startToStart = ConstraintLayout.LayoutParams.PARENT_ID
                endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
                topToTop = ConstraintLayout.LayoutParams.PARENT_ID
                bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
            }.also { addView(it) }
        }
        return ViewHolder(container, imageView)
    }

    override fun getItemCount(): Int = mDatas.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data = mDatas.get(position)

        Glide.with(holder.imageView)
            .load(data.url)
            .override(holder.itemView.context.screenWidth / 3, 200.dp)
            .thumbnail(0.2F)
            .into(holder.imageView)

        with(holder.itemView) {
            setOnClickListener {
                listener?.onItemClick(holder.imageView, position)
            }
        }
    }

    /**
     * 获取屏幕宽度PX
     */
    private val Context.screenWidth: Int
        get() {
            val wm = getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val outMetrics = DisplayMetrics()
            wm.defaultDisplay.getMetrics(outMetrics)
            return outMetrics.widthPixels
        }

    inner class ViewHolder(
        itemView: View,
        val imageView: ImageView
    ) :
        RecyclerView.ViewHolder(itemView) {
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    interface OnItemClickListener {
        fun onItemClick(view: ImageView, position: Int)
    }

}