package com.example.homehive.data

import com.example.homehive.R

data class CategoryData(
    val title: String,
    val icon: Int
)

val categoryList = listOf(
    CategoryData("Home", R.drawable.category_home),
    CategoryData("Flat", R.drawable.category_flat),
    CategoryData("Villa", R.drawable.category_villa),
    CategoryData("Apartment", R.drawable.category_appartment),
)
