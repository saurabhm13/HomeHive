package com.example.homehive.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.homehive.presentation.category.CategoryWiseScreen
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
            DetailsScreen(navController)
        }

        composable(
            route = Screens.CategoryWiseScreen.route
        ) {
            CategoryWiseScreen(navController)
        }
    }
}