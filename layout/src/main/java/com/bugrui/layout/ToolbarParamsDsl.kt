package com.bugrui.layout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

open class _Toolbar(ctx: Context): androidx.appcompat.widget.Toolbar(ctx) {

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        c: Context?,
        attrs: AttributeSet?
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(c!!, attrs!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(width, height)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        gravity: Int,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        width: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        height: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        gravity: Int
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(width, height, gravity)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        gravity: Int,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(gravity)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        gravity: Int
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(gravity)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: androidx.appcompat.widget.Toolbar.LayoutParams?,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: androidx.appcompat.widget.Toolbar.LayoutParams?
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: android.app.ActionBar.LayoutParams?,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: android.app.ActionBar.LayoutParams?
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.LayoutParams?,
        init: androidx.appcompat.widget.Toolbar.LayoutParams.() -> Unit
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.layoutParams = layoutParams
        return this
    }

    inline fun <T: View> T.lparams(
        source: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = androidx.appcompat.widget.Toolbar.LayoutParams(source!!)
        this@lparams.layoutParams = layoutParams
        return this
    }

}