package com.example.homehive.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homehive.R
import com.example.homehive.data.PropertyInfo
import com.example.homehive.data.propertyList
import com.example.homehive.presentation.comman.CardPropertyHighlights
import com.example.homehive.presentation.comman.CardTitleAndRating

@Composable
fun PropertyCardHor(
    propertyInfo: PropertyInfo
) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        color = Color.White,
        modifier = Modifier.padding(4.dp),
        shadowElevation = 4.dp,
//        elevation = CardDefaults.cardElevation(2.dp),
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(RoundedCornerShape(10)),
                painter = painterResource(id = propertyInfo.images[0]),
                contentDescription = "Property Image",
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                CardTitleAndRating(title = propertyInfo.name, rating = propertyInfo.rating)

                Spacer(modifier = Modifier.height(4.dp))

                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.location),
                        contentDescription = "Location"
                    )

                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "New York", style = MaterialTheme.typography.titleSmall)
                }

                Spacer(modifier = Modifier.height(4.dp))

                CardPropertyHighlights(
                    noOfBedroom = propertyInfo.noOfBedrooms,
                    noOfBathroom = propertyInfo.noOfBathroom,
                    areaStFt = propertyInfo.areaSqFt
                )
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun PropertyCardHorPreview() {
    PropertyCardHor(propertyInfo = propertyList[0])
}