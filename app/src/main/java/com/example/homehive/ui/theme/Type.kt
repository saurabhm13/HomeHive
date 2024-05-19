package com.example.homehive.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.homehive.R

val ubuntu = FontFamily(
    Font(R.font.ubuntu_light, FontWeight.Light),
    Font(R.font.ubuntu_regular, FontWeight.Normal),
    Font(R.font.ubuntu_bold, FontWeight.Bold),
    Font(R.font.ubuntu_medium, FontWeight.Medium)

)

val Typography = Typography(

    headlineLarge = TextStyle(
        fontFamily = ubuntu,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
    ),

    headlineMedium = TextStyle(
        fontFamily = ubuntu,
        fontSize = 28.sp,
        fontWeight = FontWeight.Normal,
    ),

    headlineSmall = TextStyle(
        fontFamily = ubuntu,
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal,
    ),

    labelLarge = TextStyle(
        fontFamily = ubuntu,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
    ),

    labelMedium = TextStyle(
        fontFamily = ubuntu,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
    ),

    labelSmall = TextStyle(
        fontFamily = ubuntu,
        fontSize = 11.sp,
        fontWeight = FontWeight.Medium,
    ),

    titleLarge = TextStyle(
        fontFamily = ubuntu,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
    ),

    titleMedium = TextStyle(
        fontFamily = ubuntu,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
    ),

    titleSmall = TextStyle(
        fontFamily = ubuntu,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
    ),

    bodyLarge = TextStyle(
        fontFamily = ubuntu,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
    ),

    bodyMedium = TextStyle(
        fontFamily = ubuntu,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
    ),

    bodySmall = TextStyle(
        fontFamily = ubuntu,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
    ),

    )