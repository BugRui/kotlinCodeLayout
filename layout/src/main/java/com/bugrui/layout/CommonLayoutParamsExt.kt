package com.bugrui.layout

import android.view.View
import android.view.ViewGroup

val layoutMatchParent: Int = android.view.ViewGroup.LayoutParams.MATCH_PARENT
val layoutWrapContent: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT



/**
 * 设置view大小
 */
fun View.setParams(width: Int, height: Int) {
    if (layoutParams != null) {
        val params = layoutParams
        params.width = width
        params.height = height
        layoutParams = params
    } else {
        layoutParams = ViewGroup.LayoutParams(width, height)
    }
}