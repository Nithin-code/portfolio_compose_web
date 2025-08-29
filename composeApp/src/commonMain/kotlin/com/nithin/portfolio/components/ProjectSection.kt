package com.nithin.portfolio.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.Constants
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.ProjectData
import com.nithin.portfolio.utils.SurfaceBackGround
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.down

@Composable
fun ProjectSection(
    modifier: Modifier = Modifier,
    title : String = "",
    deviceType : DeviceType
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

            ResponsiveTitleText(
                modifier = Modifier,
                title = title,
                deviceType = deviceType
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                val itensSize = ProjectData.entries.size

                ProjectData.entries.forEach { projectData ->

                    ProjectDetails(
                        modifier = Modifier.weight(1f/itensSize),
                        deviceType = deviceType,
                        icon = projectData.icon,
                        projectTitle = projectData.projectName,
                        projectSubTitle =  projectData.techUsed,
                    )

                }

            }

        }
    }

}