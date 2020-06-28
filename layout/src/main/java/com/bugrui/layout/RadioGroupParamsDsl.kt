package com.bugrui.layout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup

open class _RadioGroup(ctx: Context): RadioGroup(ctx) {

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?,
        init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?
    ): T {
        val layoutParams = RadioGroup.LayoutParams(c!!, attrs!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        initWeight: Float,
        init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height, initWeight)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        initWeight: Float
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height, initWeight)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        p: ViewGroup.LayoutParams?,
        init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        p: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = RadioGroup.LayoutParams(p!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?,
        init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = RadioGroup.LayoutParams(source!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

}