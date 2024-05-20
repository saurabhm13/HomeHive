package com.example.homehive.presentation.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.homehive.data.PropertyInfo
import com.example.homehive.presentation.category.PropertyByCategoryScreen
import com.example.homehive.presentation.details.DetailsScreen
import com.example.homehive.presentation.home.HomeScreen
import com.example.homehive.presentation.onboarding.OnBoardingScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = Screens.OnboardingScreen.route) {

        composable(
            route = Screens.OnboardingScreen.route
        ) {
            OnBoardingScreen(navController)
        }

        composable(
            route = Screens.HomeScreen.route
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Screens.DetailsScreen.route

        ) {

            val result = navController.previousBackStackEntry?.savedStateHandle?.get<PropertyInfo>("propertyInfo")

            if (result != null) {
                DetailsScreen(navController, result)
            }
        }

        composable(
            route = Screens.PropertyByCategoryScreen.route + "/{categoryTitle}",
            arguments = listOf(
                navArgument("categoryTitle") {
                    type = NavType.StringType
                }
            )
        ) {
            it.arguments?.getString("categoryTitle")
                ?.let { it1 -> PropertyByCategoryScreen(navController, categoryTitle = it1) }
        }
    }
}