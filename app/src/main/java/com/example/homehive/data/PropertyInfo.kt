package com.example.homehive.data

import com.example.homehive.R

data class PropertyInfo(
    val name: String,
    val images: List<Int>,
    val noOfBedrooms: Int,
    val noOfBathroom: Int,
    val areaSqFt: Int,
    val rating: Double
)

val propertyList = listOf(
    PropertyInfo("Minimal living flat", listOf(R.drawable.out_house5, R.drawable.out_house4, R.drawable.int_house1, R.drawable.int_house2), 3, 2, 8870, 4.7),
    PropertyInfo("Minimal living flat", listOf(R.drawable.out_house3, R.drawable.out_house2, R.drawable.int_house3, R.drawable.int_house4), 4, 4, 8472, 4.4),
    PropertyInfo("Minimal living flat", listOf(R.drawable.out_house7, R.drawable.out_house8, R.drawable.int_house5, R.drawable.int_house6), 5, 4, 9376, 4.6),
    PropertyInfo("Minimal living flat", listOf(R.drawable.out_house10, R.drawable.out_house9, R.drawable.int_house1, R.drawable.int_house7), 3, 3, 5363, 4.9),
    PropertyInfo("Minimal living flat", listOf(R.drawable.out_house11, R.drawable.out_house3, R.drawable.int_house1, R.drawable.int_house7), 6, 4, 8346, 4.2),
    PropertyInfo("Minimal living flat", listOf(R.drawable.out_house8, R.drawable.out_house7, R.drawable.int_house1, R.drawable.int_house7), 5, 4, 9162, 4.0),
)
