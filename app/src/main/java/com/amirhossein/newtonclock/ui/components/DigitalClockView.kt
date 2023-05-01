package com.amirhossein.newtonclock.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amirhossein.newtonclock.common.Constants
import com.amirhossein.newtonclock.common.Constants.SMALL_CLOCK_COUNT_IN_COLUMN
import com.amirhossein.newtonclock.common.Constants.SMALL_CLOCK_COUNT_IN_ROW
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Eight
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Five
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Four
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Nine
import com.amirhossein.newtonclock.common.DigitalClockNumbers.One
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Seven
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Six
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Three
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Two
import com.amirhossein.newtonclock.common.DigitalClockNumbers.Zero
import com.amirhossein.newtonclock.model.SmallClock

@Composable
fun DigitalClockView(
    timeArray:Array<SmallClock>,
    modifier: Modifier = Modifier
) {
    val rowCount = SMALL_CLOCK_COUNT_IN_ROW
    val columnCount = SMALL_CLOCK_COUNT_IN_COLUMN
    BoxWithConstraints(modifier){
        val smallClockSize = maxWidth / rowCount
        Column(verticalArrangement = Arrangement.SpaceEvenly) {
            (0 until columnCount).forEach{row->
                Row(
                    Modifier) {
                    (0 until rowCount).forEach { column ->
                        val smallClock = timeArray[(row * rowCount) + column]
                        SmallClockView(
                            hourHand = smallClock.hourHand,
                            minuteHand = smallClock.minuteHand,
                            modifier = Modifier.size(smallClockSize),
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun NumberClock(number: Int) {
    val array = when (number) {
        1 -> One
        2 -> Two
        3 -> Three
        4 -> Four
        5 -> Five
        6 -> Six
        7 -> Seven
        8 -> Eight
        9 -> Nine
        else -> Zero
    }

    DigitalClockView(array)
}

@Preview
@Composable
fun DigitalClockViewPreview() {
    Surface {
        NumberClock(1)
    }
}