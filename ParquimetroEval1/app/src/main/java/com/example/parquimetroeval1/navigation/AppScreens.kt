package com.example.parquimetroeval1.navigation

sealed class AppScreens (
    val route: String
){
    object HomeScreen: AppScreens("HomeScreen")
    object ConfigScreen: AppScreens("ConfigScreen")
    object DetailScreen : AppScreens("DetailScreen")
    object AddScreen : AppScreens("AddScreen")

}