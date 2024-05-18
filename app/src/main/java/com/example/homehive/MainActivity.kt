package com.example.homehive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.homehive.presentation.onboarding.OnBoardingScreen
import com.example.homehive.ui.theme.HomeHiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeHiveTheme {
                OnBoardingScreen()
            }
        }
    }
}