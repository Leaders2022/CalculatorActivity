package com.george.intentcalcwebg.ui.theme.screens.web

import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun Web_Screen(navController: NavController) {
    var url by remember { mutableStateOf(value = "") }
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,


        modifier = Modifier.fillMaxSize()){
        Spacer(modifier= Modifier.height(50.dp))
        Text(text = "Web Screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Cyan)

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(onClick = {
            url="https://www.google.com/"
        },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Google",
                fontSize = 30.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        if (url.isEmpty()){
            AndroidView(factory = {context ->
                WebView(context).apply {
                    webViewClient= WebViewClient()
                    settings.javaScriptEnabled=true
                    loadUrl(url)
                }

            }
            )
        }


    }
}

@Preview
@Composable
private fun WebPrev() {
    Web_Screen(rememberNavController())
}


