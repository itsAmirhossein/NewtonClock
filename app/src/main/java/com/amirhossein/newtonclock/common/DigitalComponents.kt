package com.amirhossein.newtonclock.common


import com.amirhossein.newtonclock.model.SmallClock.Companion.BottomLeft
import com.amirhossein.newtonclock.model.SmallClock.Companion.BottomRight
import com.amirhossein.newtonclock.model.SmallClock.Companion.Default
import com.amirhossein.newtonclock.model.SmallClock.Companion.Horizontal
import com.amirhossein.newtonclock.model.SmallClock.Companion.TopLeft
import com.amirhossein.newtonclock.model.SmallClock.Companion.TopRight
import com.amirhossein.newtonclock.model.SmallClock.Companion.Vertical


object DigitalComponents {
    val Zero = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        Vertical, TopLeft, TopRight, Vertical,
        Vertical, Vertical, Vertical, Vertical,
        Vertical, Vertical, Vertical, Vertical,
        Vertical, BottomLeft, BottomRight, Vertical,
        BottomLeft, Horizontal, Horizontal, BottomRight,
    )
    val One = arrayOf(
        TopLeft, Horizontal, TopRight, Default,
        BottomLeft, TopRight, Vertical, Default,
        Default, Vertical, Vertical, Default,
        Default, Vertical, Vertical, Default,
        TopLeft, BottomRight, BottomLeft, TopRight,
        BottomLeft, Default, Default, BottomRight,
    )
    val Two = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        BottomLeft, Horizontal, TopRight, Vertical,
        TopLeft, Horizontal, BottomRight, Vertical,
        Vertical, TopLeft, Horizontal, BottomRight,
        Vertical, BottomLeft, Horizontal, TopRight,
        BottomLeft, Horizontal, Horizontal, BottomRight,
    )
    val Three = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        BottomLeft, Horizontal, TopRight, Vertical,
        TopLeft, Horizontal, BottomRight, Vertical,
        BottomLeft, Horizontal, TopRight, Vertical,
        TopLeft, Horizontal, BottomRight, Vertical,
        BottomLeft, Horizontal, Horizontal, BottomRight,
    )
    val Four = arrayOf(
        TopLeft, TopRight, TopLeft, TopRight,
        Vertical, Vertical, Vertical, Vertical,
        Vertical, BottomLeft, BottomRight, Vertical,
        BottomLeft, Horizontal, TopRight, Vertical,
        Default, Default, Vertical, Vertical,
        Default, Default, BottomLeft, BottomRight,
    )
    val Five = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        Vertical, TopLeft, Horizontal, Default,
        Vertical, BottomLeft, Horizontal, TopRight,
        BottomLeft, Horizontal, TopRight, Vertical,
        TopLeft, Horizontal, BottomRight, Vertical,
        BottomLeft, Horizontal, Horizontal, BottomRight,
    )
    val Six = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        Vertical, TopLeft, Horizontal, BottomRight,
        Vertical, BottomLeft, Horizontal, TopRight,
        Vertical, TopLeft, TopRight, Vertical,
        Vertical, BottomLeft, BottomRight, Vertical,
        BottomLeft, Horizontal, Horizontal, BottomRight,
    )
    val Seven = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        BottomLeft, Horizontal, TopRight, Vertical,
        Default, Default, Vertical, Vertical,
        Default, Default, Vertical, Vertical,
        Default, Default, Vertical, Vertical,
        Default, Default, BottomLeft, BottomRight,
    )
    val Eight = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        Vertical, TopLeft, TopRight, Vertical,
        Vertical, BottomLeft, BottomRight, Vertical,
        Vertical, TopLeft, TopRight, Vertical,
        Vertical, BottomLeft, BottomRight, Vertical,
        BottomLeft, Horizontal, Horizontal, BottomRight,
    )
    val Nine = arrayOf(
        TopLeft, Horizontal, Horizontal, TopRight,
        Vertical, TopLeft, TopRight, Vertical,
        Vertical, BottomLeft, BottomRight, Vertical,
        BottomLeft, Horizontal, TopRight, Vertical,
        TopLeft, Horizontal, BottomRight, Vertical,
        BottomLeft, Horizontal, Horizontal, BottomRight,
    )
}
