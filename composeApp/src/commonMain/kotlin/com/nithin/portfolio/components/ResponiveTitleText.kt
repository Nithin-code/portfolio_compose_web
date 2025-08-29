package com.nithin.portfolio.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateValueAsState
import androidx.compose.animation.core.tween
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.TextPrimary
import com.nithin.portfolio.utils.UbuntuMedium
import com.nithin.portfolio.utils.UbuntuRegular

@Composable
fun ResponsiveTitleText(
    modifier: Modifier = Modifier,
    title : String = "",
    font : FontFamily = UbuntuMedium(),
    deviceType: DeviceType,
    textColor : Color = TextPrimary
){

    val fontSize = animateFloatAsState(
        targetValue = if (deviceType == DeviceType.MOBILE) 32f else 48f,
        animationSpec = tween(durationMillis = 500),
        label = ""
    )


    Text(
        modifier = modifier,
        text = title,
        fontFamily = font,
        fontSize = fontSize.value.sp,
        color = textColor
    )

}


@Composable
fun ResponsiveBodyText(
    modifier: Modifier = Modifier,
    bodyText : String = "",
    font : FontFamily = UbuntuMedium(),
    deviceType: DeviceType,
    textColor : Color = TextPrimary
){

    val targetValue = when(deviceType){
        DeviceType.MOBILE -> 14f
        DeviceType.TAB -> 16f
        DeviceType.DESKTOP -> 20f
    }

    val fontSize = animateFloatAsState(
        targetValue =  targetValue,
        animationSpec = tween(durationMillis = 500),
        label = ""
    )


    Text(
        modifier = modifier,
        text = bodyText,
        fontFamily = font,
        fontSize = fontSize.value.sp,
        color = textColor
    )

}


@Composable
fun FixedSubTitleText(
    modifier: Modifier = Modifier,
    subTitle : String = "",
    font : FontFamily = UbuntuRegular(),
    textColor : Color = TextPrimary,
    fontSize: TextUnit = 18.sp
){


    Text(
        modifier = modifier,
        text = subTitle,
        fontFamily = font,
        fontSize = fontSize,
        color = textColor
    )

}