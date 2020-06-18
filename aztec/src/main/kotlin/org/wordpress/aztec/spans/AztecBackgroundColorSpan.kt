package org.wordpress.aztec.spans

import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import org.wordpress.aztec.AztecAttributes

class AztecBackgroundColorSpan(
        val color: Int,
        tag: String = "span",
        override var attributes: AztecAttributes = AztecAttributes()
) : BackgroundColorSpan(color), IAztecInlineSpan {

    fun getColorHex(): String {
        return java.lang.String.format("#%06X", 0xFFFFFF and color)
    }

    override val TAG = tag
}

class AztecColorSpan(
        val color: Int,
        tag: String = "span",
        override var attributes: AztecAttributes = AztecAttributes()
) : ForegroundColorSpan(color), IAztecInlineSpan {

    fun getColorHex(): String {
        return java.lang.String.format("#%06X", 0xFFFFFF and color)
    }

    override val TAG = tag
}