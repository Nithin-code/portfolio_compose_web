package com.nithin.portfolio.components

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.Constants
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextType
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.down

@Composable
fun ExperienceSection(
    modifier: Modifier = Modifier,
    title : String = "Experience",
    deviceType : DeviceType,
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
                ResponsiveText(
                    modifier = Modifier.weight(1f),
                    title = title,
                    deviceType = deviceType,
                    textType = TextType.HEADING
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
                bodyText = Constants.EXPERIENCE,
                deviceType = deviceType,
                maxLines = maxLines.value
            )

        }
    }

}