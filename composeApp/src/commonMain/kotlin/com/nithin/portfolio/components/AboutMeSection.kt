package com.nithin.portfolio.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.Constants
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.PrimaryAccent
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextPrimary
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuMedium
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.down

@Composable
fun AboutMeSection(
    modifier: Modifier = Modifier,
    deviceType: DeviceType,
    title : String,
){

    var isExpanded by remember {
        mutableStateOf(false)
    }

    val maxLines = animateIntAsState(
        targetValue = if (isExpanded) 20 else 2,
        animationSpec = tween(durationMillis = 800)
    )

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
                    modifier = Modifier.weight(1f),
                    title = title,
                    deviceType = deviceType
                )

                AnimatableIcon(
                    icon = Res.drawable.down,
                    isSelected = isExpanded,
                    onIconClicked = {
                        isExpanded = !isExpanded
                    }
                )

            }
            ResponsiveBodyText(
                bodyText = Constants.aboutMeText,
                deviceType = deviceType,
                maxLines = maxLines.value
            )

        }
    }

}