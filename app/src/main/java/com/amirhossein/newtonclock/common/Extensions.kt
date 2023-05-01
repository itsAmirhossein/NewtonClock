package com.amirhossein.newtonclock.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

@Composable
fun Dp.toPx() = with(LocalDensity.current) { toPx() }

@Composable
fun Int.pxToDp() = with(LocalDensity.current) { toDp() }
fun Int.firstDigit() = this / 10

fun Int.secondDigit() = this % 10