package com.bugrui.layout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout

open class _TableLayout(ctx: Context): TableLayout(ctx) {

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?,
        init: TableLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?
    ): T {
        val layoutParams = TableLayout.LayoutParams(c!!, attrs!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        init: TableLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT
    ): T {
        val layoutParams = TableLayout.LayoutParams(width, height)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        initWeight: Float,
        init: TableLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableLayout.LayoutParams(width, height, initWeight)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        initWeight: Float
    ): T {
        val layoutParams = TableLayout.LayoutParams(width, height, initWeight)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        init: TableLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableLayout.LayoutParams()
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(

    ): T {
        val layoutParams = TableLayout.LayoutParams()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        p: ViewGroup.LayoutParams?,
        init: TableLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableLayout.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        p: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = TableLayout.LayoutParams(p!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?,
        init: TableLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = TableLayout.LayoutParams(source!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

}