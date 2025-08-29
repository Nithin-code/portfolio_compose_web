package com.nithin.portfolio

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.getDeviceType
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {

    var deviceType by remember {
        mutableStateOf(DeviceType.MOBILE)
    }
    MaterialTheme {
        Scaffold(
        ) { padd->
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padd)
            ) {
                deviceType = maxWidth.getDeviceType()
                ResponsiveLayout(
                    deviceType = deviceType
                )
            }
        }
    }
}