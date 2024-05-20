package com.example.homehive.presentation.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.homehive.R
import com.example.homehive.data.PropertyInfo
import com.example.homehive.data.propertyList
import com.example.homehive.presentation.comman.CardTitleAndRating

@Composable
fun DetailsScreen(
    navController: NavController,
    propertyInfo: PropertyInfo
) {

    val scrollState = rememberScrollState()

    var descriptionMaxLine by remember {
        mutableIntStateOf(6)
    }

    Scaffold(
        contentWindowInsets = WindowInsets.navigationBars,
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(Color.White)
                    .padding(horizontal = 20.dp),
            ) {
                ElevatedButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .align(Alignment.Center),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Book Now")
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(scrollState)

        ) {

            // Image Section
            ImageSection(propertyInfo, navController)

            // Details Section
            Column(
                modifier = Modifier.padding(horizontal = 15.dp)
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                CardTitleAndRating(
                    title = propertyInfo.name,
                    rating = 4.5,
                    textStyle = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
                )

                // Location
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.location),
                        contentDescription = "Location"
                    )

                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "New Your", style = MaterialTheme.typography.bodyMedium)

                }

                // Property highlights
                Spacer(modifier = Modifier.height(20.dp))
                PropertyHighlights(noOfBedroom = 4, noOfBathroom = 3, areaStFt = 2380)

                // Description
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                )

                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    modifier = Modifier.clickable {
                        descriptionMaxLine = if (descriptionMaxLine == 6) 9999 else 6
                    },
                    text = propertyInfo.description,
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = descriptionMaxLine,
                    overflow = TextOverflow.Ellipsis
                )

                // Facilities
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Facilities",
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                )

                // Property highlights
                Spacer(modifier = Modifier.height(10.dp))
                PropertyFacilities()

                // Contact Details
                Spacer(modifier = Modifier.height(20.dp))
                ContactDetails(propertyInfo)

                Spacer(modifier = Modifier.height(10.dp))

            }

        }
    }
}

@Composable
private fun ImageSection(
    propertyInfo: PropertyInfo,
    navController: NavController
) {
    var currentImage by remember {
        mutableIntStateOf(0)
    }

    var isFavorite by remember {
        mutableStateOf(false)
    }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp),
            painter = rememberAsyncImagePainter(propertyInfo.images[currentImage]),
            contentDescription = "Property Image",
            contentScale = ContentScale.Crop

        )

        Box(
            modifier = Modifier
                .padding(end = 10.dp, top = 40.dp)
                .align(Alignment.TopEnd)
                .clickable { isFavorite = !isFavorite }
        ) {
            Image(
                painter = painterResource(id = if (isFavorite) R.drawable.heart else R.drawable.ic_like_outlined),
                contentDescription = "Favorite Icon",
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White)
                    .padding(8.dp),

                )
        }

        Box(
            modifier = Modifier
                .padding(start = 10.dp, top = 40.dp)
                .align(Alignment.TopStart)
                .clickable {
                    navController.popBackStack()
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_left),
                contentDescription = "Back Icon",
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White)
                    .padding(8.dp),

                )
        }

        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 20.dp)
                .align(Alignment.BottomCenter)
        ) {
            for ((index, images) in propertyInfo.images.withIndex()) {
                Image(
                    modifier = Modifier
                        .size(80.dp)
                        .padding(4.dp)
                        .border(
                            width = 2.dp,
                            color = if (currentImage == index) MaterialTheme.colorScheme.primary else Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clip(RoundedCornerShape(10.dp))
                        .clickable { currentImage = index },
                    painter = rememberAsyncImagePainter(images),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Composable
private fun ContactDetails(propertyInfo: PropertyInfo) {
    Text(
        text = "Contact Details",
        style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
    )

    Spacer(modifier = Modifier.height(10.dp))
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .clip(RoundedCornerShape(40.dp)),
            painter = painterResource(id = propertyInfo.agentImage),
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(15.dp))
        Column(
            modifier = Modifier.weight(1F)
        ) {
            Text(
                text = propertyInfo.agentName,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
            )

            Text(
                text = "Agent",
                style = MaterialTheme.typography.titleSmall.copy(color = Color.Gray)
            )
        }

        Spacer(modifier = Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .padding(10.dp)
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(20.dp)
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.message_alt_1),
                contentDescription = "Message Icon",
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color.White)
                    .padding(8.dp),

                )
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(20.dp)
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.call),
                contentDescription = "Call Icon",
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color.White)
                    .padding(8.dp),

                )
        }

    }
}

@Composable
fun PropertyHighlights(
    noOfBedroom: Int,
    noOfBathroom: Int,
    areaStFt: Int
) {

    Row {
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.bed),
            data = noOfBedroom.toString(),
            isItArea = false
        )

        Spacer(modifier = Modifier.width(20.dp))
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.shower),
            data = noOfBathroom.toString(),
            isItArea = false
        )

        Spacer(modifier = Modifier.width(20.dp))
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.frame),
            data = areaStFt.toString(),
            isItArea = true
        )
    }
}

@Composable
fun PropertyFacilities() {

    val scrollState = rememberScrollState()

    Row(
        modifier = Modifier.horizontalScroll(scrollState)
    ) {
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.bed),
            data = "Car Parking",
            isItArea = false
        )

        Spacer(modifier = Modifier.width(20.dp))
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.shower),
            data = "Kids Zone",
            isItArea = false
        )

        Spacer(modifier = Modifier.width(20.dp))
        SinglePropertyHighlight(
            icon = painterResource(id = R.drawable.frame),
            data = "Security",
            isItArea = false
        )
    }
}

@Composable
fun SinglePropertyHighlight(
    icon: Painter,
    data: String,
    isItArea: Boolean
) {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(10.dp),
        shadowElevation = 4.dp

    ) {
        Row(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(30.dp),
                painter = icon,
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = if (isItArea) "$data sq.ft" else data,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview
@Composable
fun DetailsScreenPreview() {
    DetailsScreen(rememberNavController(), propertyList[0])
}
