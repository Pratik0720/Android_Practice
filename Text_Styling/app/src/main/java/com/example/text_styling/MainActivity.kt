package com.example.text_styling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.text_styling.ui.theme.Text_StylingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Text_StylingTheme {
                Scaffold { innerPadding ->

                    val fontFamily = FontFamily(
                        Font(R.font.playwrite_thin, FontWeight.Thin),
                        Font(R.font.playwrite_extralight, FontWeight.ExtraLight),
                        Font(R.font.playwrite_regular, FontWeight.Normal),
                        Font(R.font.playwrite_light, FontWeight.Light),
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(Color(0xFF101010))
                    ){
                        Text(
                            text = buildAnnotatedString {
                                withStyle(
                                    SpanStyle(
                                        fontSize = 50.sp,
                                        color = Color.Red,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Bold,
                                        textDecoration = TextDecoration.LineThrough
                                    )
                                ){
                                    append("K")
                                }
                                append("en")

                                withStyle(
                                    SpanStyle(
                                        fontSize = 50.sp,
                                        color = Color.Red,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Bold,
                                        textDecoration = TextDecoration.LineThrough
                                    )
                                ){
                                    append("K")
                                }
                                append("anaki")
                            },

                            fontSize = 30.sp,
                            color = Color.White,
                            fontFamily = fontFamily,
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.LineThrough
                        )
                    }
                }
            }
        }
    }
}

