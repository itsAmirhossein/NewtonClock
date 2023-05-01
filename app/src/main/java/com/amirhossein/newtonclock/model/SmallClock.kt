package com.amirhossein.newtonclock.model

data class SmallClock(
    val hourHand : Int,
    val minuteHand : Int,
){
    companion object{
        val TopRight = SmallClock(9, 6)
        val TopLeft = SmallClock(3, 6)
        val BottomRight = SmallClock(9, 0)
        val BottomLeft = SmallClock(3, 0)
        val Vertical = SmallClock(0, 6)
        val Horizontal = SmallClock(3, 9)
        val Default = SmallClock(7,1)
    }
}
