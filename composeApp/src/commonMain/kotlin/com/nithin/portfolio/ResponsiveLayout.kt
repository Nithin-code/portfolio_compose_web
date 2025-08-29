package com.nithin.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nithin.portfolio.components.AboutMeSection
import com.nithin.portfolio.components.HeaderSection
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.getArrangementSpace
import com.nithin.portfolio.utils.getDeviceTypePadding


@Composable
fun ResponsiveLayout(
    deviceType: DeviceType
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(SurfaceBackGround)
            .padding(deviceType.getDeviceTypePadding()),
        verticalArrangement = Arrangement.spacedBy(
            deviceType.getArrangementSpace()
        )
    ) {

        item {
            HeaderSection(
                modifier = Modifier
                    .fillMaxWidth(),
                title = "HI, I'm Nithin",
                subTitle = "Android Developer | Kotlin | Jetpack Compose | KMP",
                deviceType = deviceType
            )
        }

        item {
            AboutMeSection(
                deviceType = deviceType,
                title = "About Me"
            )
        }

    }
}