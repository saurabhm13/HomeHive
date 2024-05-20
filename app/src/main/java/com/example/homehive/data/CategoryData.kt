package com.example.homehive.data

import com.example.homehive.R

data class CategoryData(
    val title: String,
    val icon: Int
)

val categoryList = listOf(
    CategoryData("Home", R.drawable.home_image),
    CategoryData("Flat", R.drawable.flat),
    CategoryData("Villa", R.drawable.villa),
    CategoryData("Apartment", R.drawable.appartment),
)
