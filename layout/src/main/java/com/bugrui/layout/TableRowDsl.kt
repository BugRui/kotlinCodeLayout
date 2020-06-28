package com.bugrui.layout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow

open class _TableRow(ctx: Context): TableRow(ctx) {

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?,
        init: TableRow.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableRow.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?
    ): T {
        val layoutParams = TableRow.LayoutParams(c!!, attrs!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        init: TableRow.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableRow.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT
    ): T {
        val layoutParams = TableRow.LayoutParams(width, height)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        initWeight: Float,
        init: TableRow.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableRow.LayoutParams(width, height, initWeight)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        initWeight: Float
    ): T {
        val layoutParams = TableRow.LayoutParams(width, height, initWeight)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        init: TableRow.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableRow.LayoutParams()
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(

    ): T {
        val layoutParams = TableRow.LayoutParams()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        column: Int,
        init: TableRow.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableRow.LayoutParams(column)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        column: Int
    ): T {
        val layoutParams = TableRow.LayoutParams(column)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        p: ViewGroup.LayoutParams?,
        init: TableRow.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableRow.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        p: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = TableRow.LayoutParams(p!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?,
        init: TableRow.LayoutParams.() -> Unit
    ): T {
        val layoutParams = TableRow.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = TableRow.LayoutParams(source!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

}