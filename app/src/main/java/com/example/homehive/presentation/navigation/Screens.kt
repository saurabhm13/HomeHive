package com.example.homehive.presentation.navigation

import com.example.homehive.presentation.navigation.ScreenConstants.CATEGORY_WISE_SCREEN
import com.example.homehive.presentation.navigation.ScreenConstants.DETAILS_SCREEN
import com.example.homehive.presentation.navigation.ScreenConstants.HOME_SCREEN
import com.example.homehive.presentation.navigation.ScreenConstants.ONBOARDING_SCREEN

sealed class Screens(val route: String) {

    data object OnboardingScreen : Screens(ONBOARDING_SCREEN)
    data object HomeScreen : Screens(HOME_SCREEN)
    data object CategoryWiseScreen : Screens(CATEGORY_WISE_SCREEN)
    data object DetailsScreen : Screens(DETAILS_SCREEN)

    fun withArg(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}