package com.example.homehive.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homehive.R

@Composable
fun CategoriesCard(
    icon: Painter,
    title: String,
    onClick: () -> Unit
) {

    Surface(
        modifier = Modifier
            .height(100.dp)
            .width(115.dp)
            .padding(4.dp)
            .clickable(onClick = onClick),
        color = Color.White,
        shape = RoundedCornerShape(10.dp),
        shadowElevation = 4.dp,
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                modifier = Modifier.size(40.dp),
                painter = icon, contentDescription = null,
                contentScale = ContentScale.FillHeight
            )

            Spacer(modifier = Modifier.height(5.dp))
            Text(text = title, style = MaterialTheme.typography.titleMedium)
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun CategoryCardPreview() {
    CategoriesCard(icon = painterResource(id = R.drawable.flat), title = "House", onClick = {})
}