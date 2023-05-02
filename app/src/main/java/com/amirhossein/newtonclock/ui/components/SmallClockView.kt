package com.amirhossein.newtonclock.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amirhossein.newtonclock.common.drawClockHand
import com.amirhossein.newtonclock.common.calculateRotationDegree

@Composable
fun SmallClockView(
    hourHand: Int,
    minuteHand: Int,
    backgroundColor :Color = Color.White,
    borderColor : Color = Color(0xFFD6CBCB),
    borderWidth : Float = 2f,
    hourHandColor:Color = Color.Black,
    hourHandWidth:Float = 4f,
    minuteHandColor:Color = Color.Black,
    minuteHandWidth:Float = 4f,
    animationDurationMillis: Int = 3000,
    modifier: Modifier = Modifier,
) {
    val hourDegreeTargetValue = hourHand.calculateRotationDegree()
    val hourDegree by animateFloatAsState(
        targetValue = hourDegreeTargetValue,
        label = "hourDegreeAnimation",
        animationSpec = tween(animationDurationMillis),
    )

    val minuteDegreeTargetValue = minuteHand.calculateRotationDegree()
    val minuteDegree by animateFloatAsState(
        targetValue = minuteDegreeTargetValue,
        label = "minuteDegreeAnimation",
        animationSpec = tween(animationDurationMillis),
    )

    Canvas(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
    ) {
        val defaultRadius = size.minDimension / 2
        drawCircle(
            color = borderColor,
            style = Stroke(width = borderWidth),
        )
        drawClockHand(
            rotationDegree = hourDegree,
            clockHandColor = hourHandColor,
            clockHandWidth = hourHandWidth,
            defaultRadius
        )

        drawClockHand(
            rotationDegree = minuteDegree,
            clockHandColor = minuteHandColor,
            clockHandWidth = minuteHandWidth,
            defaultRadius
        )
    }
}

@Preview
@Composable
fun SmallClockViewPreview() = SmallClockView(3, 6)