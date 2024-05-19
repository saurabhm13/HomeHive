package com.example.homehive.presentation.comman

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homehive.R
import com.example.homehive.ui.theme.lightGrey

@Composable
fun CardPropertyHighlights(
    noOfBedroom: Int,
    noOfBathroom: Int,
    areaStFt: Int
) {

    Row {
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.bed),
            data = noOfBedroom.toString()
        )

        Spacer(modifier = Modifier.width(10.dp))
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.shower),
            data = noOfBathroom.toString()
        )

        Spacer(modifier = Modifier.width(10.dp))
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.frame),
            data = areaStFt.toString()
        )
    }

}

@Composable
fun SinglePropertyHighlight(
    icon: Painter,
    data: String
) {
    Surface(
        color = lightGrey,
        shape = RoundedCornerShape(20.dp)

    ) {
        Row(
            modifier = Modifier.padding(horizontal = 6.dp, vertical =4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(25.dp),
                painter = icon,
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = data,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}


@Preview
@Composable
fun CardPropertyHighlightsPreview() {
    CardPropertyHighlights(noOfBedroom = 3, noOfBathroom = 2, areaStFt = 3957)
}