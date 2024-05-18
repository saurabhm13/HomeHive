package com.example.homehive.presentation.onboarding

import android.widget.StackView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homehive.R
import com.example.homehive.ui.theme.grey
import com.example.homehive.ui.theme.lightBlue

@Composable
fun OnBoardingScreen() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Spacer(modifier = Modifier.weight(1F))

            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Surface(
                    modifier = Modifier
                        .height(320.dp)
                        .width(190.dp)
                        .border(
                            width = 4.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(100.dp)
                        ),
                    shape = RoundedCornerShape(100.dp)
                ) {
                    Image(

                        contentScale = ContentScale.FillHeight,
                        painter = painterResource(id = R.drawable.out_house6),
                        contentDescription = "Onboarding image 1",
                    )
                }

                Surface(
                    modifier = Modifier
                        .padding(start = 90.dp, top = 180.dp)
                        .height(200.dp)
                        .width(170.dp)
                        .border(
                            width = 4.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(30.dp)
                        ),
                    shape = RoundedCornerShape(30.dp)
                ) {
                    Image(

                        contentScale = ContentScale.FillHeight,
                        painter = painterResource(id = R.drawable.out_house5),
                        contentDescription = "Onboarding image 1",
                    )
                }
            }

            Spacer(modifier = Modifier.weight(0.5F))

            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = stringResource(id = R.string.onboarding_text),
                style = MaterialTheme.typography.headlineLarge
            )

            Spacer(modifier = Modifier.weight(0.5F))

            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Surface(
                    modifier = Modifier
                        .height(45.dp)
                        .width(60.dp)
                        .border(
                            width = 0.dp,
                            color = MaterialTheme.colorScheme.background,
                            shape = RoundedCornerShape(topEnd = 8.dp, bottomEnd = 8.dp)
                        ),
                    shape = RoundedCornerShape(topEnd = 8.dp, bottomEnd = 8.dp),
                    color = lightBlue
                ) {

                }
                Image(
                    modifier = Modifier
                        .padding(start = 40.dp)
                        .size(50.dp),
                    painter = painterResource(id = R.drawable.arrow_right),
                    contentDescription = "Start"
                )
            }

            Spacer(modifier = Modifier.weight(1F))

        }
    }
}

@Preview
@Composable
fun OnboardingScreenPreview() {
    OnBoardingScreen()
}