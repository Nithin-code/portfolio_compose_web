package com.nithin.portfolio.utils

import org.jetbrains.compose.resources.DrawableResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.save_money

enum class ProjectData(
    val icon : DrawableResource,
    val projectName : String,
    val techUsed : String,
) {

    EXPENSE_TRACKER(
        icon = Res.drawable.save_money,
        projectName = "Expense Tracker",
        techUsed = "Kotlin + Compose"
    ),

    NOTES_APP(
        icon = Res.drawable.save_money,
        projectName = "Notes App",
        techUsed = "Kotlin + MVVM"
    )



}