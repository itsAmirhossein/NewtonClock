package com.amirhossein.newtonclock.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amirhossein.newtonclock.common.firstDigit
import com.amirhossein.newtonclock.common.secondDigit
import com.amirhossein.newtonclock.ui.components.DigitalClockView
import kotlinx.coroutines.delay
import java.util.Calendar

@Composable
fun NewtonClockScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        val hour = remember { mutableStateOf(0) }
        val minute = remember { mutableStateOf(0) }
        val second = remember { mutableStateOf(0) }
        setTime(hour, minute, second)
        LaunchedEffect(
            key1 = Unit,
            block = {
                while (true) {
                    delay(100)
                    setTime(hour, minute, second)
                }
            },
        )
        BoxWithConstraints {
            val eachWidth = maxWidth / 8
            Row(
                modifier = modifier.fillMaxWidth(),
            ) {

                DigitalClockView(
                    number = hour.value.firstDigit(),
                    modifier = modifier.width(eachWidth)
                )
                DigitalClockView(
                    number = hour.value.secondDigit(),
                    modifier = modifier.width(eachWidth)
                )

                DigitalClockView(number = -1, modifier = modifier.width(eachWidth))

                DigitalClockView(
                    number = minute.value.firstDigit(),
                    modifier = modifier.width(eachWidth)
                )
                DigitalClockView(
                    number = minute.value.secondDigit(),
                    modifier = modifier.width(eachWidth)
                )

                DigitalClockView(number = -1, modifier = modifier.width(eachWidth))

                DigitalClockView(
                    number = second.value.firstDigit(),
                    modifier = modifier.width(eachWidth)
                )
                DigitalClockView(
                    number = second.value.secondDigit(),
                    smallClocksAnimationDurationMillis = 700,
                    modifier = modifier.width(eachWidth)
                )
            }
        }

    }
}

@Preview(device = "spec:width=720dp,height=360dp,orientation=landscape")
@Composable
fun NewtonClockScreenPreview() = NewtonClockScreen()

fun setTime(
    hour: MutableState<Int>,
    minute: MutableState<Int>,
    second: MutableState<Int>,
) {
    val calendar = Calendar.getInstance()
    hour.value = calendar.get(Calendar.HOUR_OF_DAY)
    minute.value = calendar.get(Calendar.MINUTE)
    second.value = calendar.get(Calendar.SECOND)
}
