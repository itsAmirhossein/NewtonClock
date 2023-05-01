package com.amirhossein.newtonclock.common

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.rotate

fun Int.firstDigit() = this / 10

fun Int.secondDigit() = this % 10

fun DrawScope.drawClockHand(
    rotationDegree: Float,
    clockHandColor: Color,
    clockHandWidth: Float,
    clockRadius: Float,
) {
    rotate(rotationDegree) {
        drawLine(
            color = clockHandColor,
            strokeWidth = clockHandWidth,
            start = Offset(x = center.x, y = center.y),
            end = Offset(x = center.x, y = center.y - clockRadius)
        )
    }
}

fun Int.calculateRotationDegree(): Float = this * 360f / 12