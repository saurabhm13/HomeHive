package com.example.homehive.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.homehive.R
import com.example.homehive.data.categoryList
import com.example.homehive.data.propertyList
import com.example.homehive.presentation.home.components.CategoriesCard
import com.example.homehive.presentation.home.components.PropertyCardHor
import com.example.homehive.presentation.home.components.PropertyCardVer
import com.example.homehive.presentation.navigation.Screens
import com.example.homehive.ui.theme.ubuntu

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController
) {

    val categoryScroll = rememberScrollState()

    val pagerState = rememberPagerState(
        pageCount = { propertyList.size },
    )

    val rootScrollState = rememberScrollState()

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .padding(horizontal = 20.dp)
                .verticalScroll(rootScrollState)
        ) {

            // Top app bar
            Spacer(modifier = Modifier.height(15.dp))
            TopBar()

            // Search
            Spacer(modifier = Modifier.height(25.dp))
            Search()

            // Categories
            Spacer(modifier = Modifier.height(20.dp))
            Category(categoryScroll, navController)

            // For you
            Spacer(modifier = Modifier.height(20.dp))
            ForYou(pagerState)

            // Nearby
            Spacer(modifier = Modifier.height(20.dp))
            Nearby()

        }
    }
}

@Composable
private fun Nearby() {
    TitleAndSeeAll(title = "Nearby")

    Spacer(modifier = Modifier.height(15.dp))
    for (property in propertyList) {
        PropertyCardHor(propertyInfo = property)
    }
}

@Composable
@OptIn(ExperimentalFoundationApi::class)
private fun ForYou(pagerState: PagerState) {
    TitleAndSeeAll(title = "For You")

    Spacer(modifier = Modifier.height(15.dp))
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxWidth()
    ) { page ->
        PropertyCardVer(propertyInfo = propertyList[page])
    }
}

@Composable
private fun Category(categoryScroll: ScrollState, navController: NavController) {
    TitleAndSeeAll(title = "House Type")

    Spacer(modifier = Modifier.height(15.dp))
    Row(
        modifier = Modifier.horizontalScroll(categoryScroll)
    ) {
        for (category in categoryList) {
            CategoriesCard(
                icon = painterResource(id = category.icon),
                title = category.title,
                onClick = {
                    navController.navigate(Screens.PropertyByCategoryScreen.withArg(category.title))
                }
            )
        }
    }
}

@Composable
private fun Search() {

    var searchValue by remember {
        mutableStateOf("")
    }

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        TextField(
            value = searchValue,
            onValueChange = { searchValue = it },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .weight(1F)
                .height(50.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text(text = "Search here")
            },
        )

        Spacer(modifier = Modifier.width(15.dp))

        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp),
            shape = RoundedCornerShape(15.dp),
            color = MaterialTheme.colorScheme.primary,
        ) {
            Image(
                modifier = Modifier.padding(10.dp),
                painter = painterResource(id = R.drawable.filter_alt),
                contentDescription = "Filter",
                colorFilter = ColorFilter.tint(Color.White)
            )
        }
    }
}

@Composable
private fun TopBar() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.menu_alt),
            contentDescription = "Menu"
        )

        Spacer(modifier = Modifier.width(15.dp))
        BasicText(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontSize = 18.sp, fontFamily = ubuntu)) {
                    append("Find a home\n")
                }
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        fontFamily = ubuntu
                    )
                ) {
                    append("where you can relax")
                }
            },
        )

        Spacer(modifier = Modifier.weight(1F))
        Image(
            painter = painterResource(id = R.drawable.notification),
            contentDescription = "Notification"
        )

        Spacer(modifier = Modifier.width(10.dp))
        Surface(
            modifier = Modifier.size(40.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.head_shot3),
                contentDescription = "User Profile"
            )
        }
    }
}

@Composable
fun TitleAndSeeAll(
    title: String
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            modifier = Modifier.weight(1F),
            text = title,
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
        )
        Text(text = "See all", style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
