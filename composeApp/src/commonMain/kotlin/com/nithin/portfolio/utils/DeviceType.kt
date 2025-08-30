package com.nithin.portfolio.utils

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class DeviceType {
    MOBILE,
    TAB,
    DESKTOP
}


enum class TextType{
    HEADING,
    BUTTON,
    BODY
}

fun getHeadingSize(deviceType: DeviceType) = when(deviceType){
    DeviceType.MOBILE -> 20.sp
    DeviceType.TAB -> 24.sp
    DeviceType.DESKTOP -> 28.sp
}


fun getButtonTextSize(deviceType: DeviceType) = when(deviceType){
    DeviceType.MOBILE -> 14.sp
    DeviceType.TAB -> 16.sp
    DeviceType.DESKTOP -> 18.sp
}

fun getBodySize(deviceType: DeviceType) = when(deviceType){
    DeviceType.MOBILE -> 14.sp
    DeviceType.TAB -> 16.sp
    DeviceType.DESKTOP -> 18.sp
}


fun Dp.getDeviceType() : DeviceType{
    return if (this<600.dp) DeviceType.MOBILE
    else if (this<1024.dp) DeviceType.TAB
    else DeviceType.DESKTOP
}

fun DeviceType.getDeviceTypePadding() : Dp{
    return if (this == DeviceType.MOBILE) 16.dp
    else if (this == DeviceType.TAB) 32.dp
    else 64.dp
}

fun DeviceType.getArrangementSpace() : Dp{
    return if (this == DeviceType.MOBILE) 24.dp
    else if (this == DeviceType.TAB) 32.dp
    else 48.dp
}