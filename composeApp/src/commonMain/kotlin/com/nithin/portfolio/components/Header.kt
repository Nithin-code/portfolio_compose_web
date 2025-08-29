package com.nithin.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.PrimaryAccent
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextPrimary
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuMedium
import com.nithin.portfolio.utils.UbuntuRegular
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.ubuntu_medium

@Composable
fun HeaderSection(
    deviceType: DeviceType,
    modifier: Modifier = Modifier,
    title : String = "",
    subTitle : String = ""
) {

    var selectedBtn by remember {
        mutableStateOf("View Profile")
    }

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(SurfaceBackGround, PrimaryAccent)
                )
            )
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        ResponsiveTitleText(
            title = title,
            deviceType = deviceType
        )


        FixedSubTitleText(
            subTitle = subTitle
        )


        Row(

        ) {
            CustomButton(
                onclick = {
                    selectedBtn = it
                },
                text = "View Profile",
                deviceType = deviceType,
                isSelected = selectedBtn == "View Profile"
            )

            Spacer(modifier = Modifier.width(16.dp))

            CustomButton(
                onclick = {
                    selectedBtn = it
                },
                text = "Download Resume",
                deviceType = deviceType,
                isSelected = selectedBtn == "Download Resume"
            )
        }

    }

}