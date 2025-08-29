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

enum class TextType(val size : TextUnit){
    Mobile_Title(32.sp),
    WEB_Title(48.sp),
    BODY_LARGE(18.sp)
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