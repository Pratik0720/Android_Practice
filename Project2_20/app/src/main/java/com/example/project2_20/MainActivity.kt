package com.example.project2_20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2_20.R
import com.example.project2_20.ui.theme.Project2_20Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project2_20Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) {innerpadding ->

                   val fontFamily = FontFamily(
                       Font(R.font.playwrite_thin, FontWeight.Thin),
                       Font(R.font.playwrite_light, FontWeight.Light),
                       Font(R.font.playwrite_extralight, FontWeight.ExtraLight),
                       Font(R.font.playwrite_regular, FontWeight.Normal),
                   )

                    Column(
                        modifier = Modifier
                            .padding(innerpadding)
                    ) {
                        ImageCard(
                            painter = painterResource(id = R.drawable.monkey_d_luffy),
                            contentDescription = "Monkey_D_Luffy",
                            title = customTitle(
                                firstLetter = "M",
                                remaining = "onkey_D_Luffy",
                                fontFamily = fontFamily
                            )
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        ImageCard(
                            painter = painterResource(id = R.drawable.floating_goku),
                            contentDescription = "Floating Goku",
                            title = customTitle(
                                firstLetter = "G",
                                remaining = "oku",
                                fontFamily = fontFamily
                            )

                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        ImageCard(
                            painter = painterResource(id = R.drawable.zenitsu_agatsuma),
                            contentDescription = "Zenitsu Agatsuma",
                            title = customTitle(
                                firstLetter = "Z",
                                remaining = "enitsu Agatsuma",
                                fontFamily = fontFamily
                            )

                        )

                    }
                }
            }
        }
    }


    fun customTitle(
        firstLetter: String,
        remaining: String,
        fontFamily: FontFamily
    ): AnnotatedString {

        return buildAnnotatedString {
            withStyle(
                SpanStyle(
                    color = Color.Red,
                    fontSize = 25.sp,
                    fontFamily = fontFamily
                )
            ) {
                append(firstLetter)
            }

            append(remaining)
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: AnnotatedString,
){


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(horizontal = 12.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop

            )

            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 250f
                    )
                )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(
                    title,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp,
                        textDecoration = TextDecoration.Underline
                    )
                )
            }
        }

    }
}