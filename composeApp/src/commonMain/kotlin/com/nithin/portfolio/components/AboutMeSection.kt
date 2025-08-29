package com.nithin.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.Constants
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextPrimary
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuMedium
import org.jetbrains.compose.resources.painterResource

@Composable
fun AboutMeSection(
    modifier: Modifier = Modifier,
    deviceType: DeviceType,
    title : String,
){

    Surface(
        shape = RoundedCornerShape(16.dp),
        border = _root_ide_package_.androidx.compose.foundation.BorderStroke(
            width = 1.dp,
            color = Divider
        ),
        color = SurfaceBackGround
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                ResponsiveTitleText(
                    title = title,
                    deviceType = deviceType
                )



            }

            ResponsiveBodyText(
                bodyText = Constants.aboutMeText,
                deviceType = deviceType
            )


        }
    }

}