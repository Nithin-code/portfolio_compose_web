package com.nithin.portfolio.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.ubuntu_medium
import portfolio.composeapp.generated.resources.ubuntu_regular

@Composable
fun UbuntuRegular()  = FontFamily(org.jetbrains.compose.resources.Font(Res.font.ubuntu_regular))


@Composable
fun UbuntuMedium() = FontFamily(org.jetbrains.compose.resources.Font(Res.font.ubuntu_regular))




object FontSize{
    val EXTRA_SMALL = 10.sp
    val SMALL = 12.sp

    val REGULAR = 14.sp
    val EXTRA_REGULAR = 16.sp

    val MEDIUM = 18.sp
    val EXTRA_MEDIUM = 20.sp

    val LARGE = 30.sp
    val EXTRA_LARGE = 40.sp
}