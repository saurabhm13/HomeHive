package com.example.homehive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.homehive.presentation.navigation.NavGraph
import com.example.homehive.ui.theme.HomeHiveTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeHiveTheme {
                navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}