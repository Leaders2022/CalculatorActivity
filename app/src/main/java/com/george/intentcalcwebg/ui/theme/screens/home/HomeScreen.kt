package com.george.intentcalcwebg.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.george.intentcalcwebg.R
import com.george.intentcalcwebg.navigation.ROUTE_CALC
import com.george.intentcalcwebg.navigation.ROUTE_INTENT
import com.george.intentcalcwebg.navigation.ROUTE_WEB

@Composable
fun Home_Screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,


        modifier = Modifier.fillMaxSize()){
        Spacer(modifier= Modifier.height(50.dp))
        Text(text = "Home Screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Cyan)

        Spacer(modifier = Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.home),
            contentDescription = "Beautiful children",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray))


        Spacer(modifier= Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_INTENT)},
            modifier= Modifier.width(300.dp)){
            Text(text = "Intent",
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Cyan)

        }
        Spacer(modifier= Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_WEB)},
            modifier= Modifier.width(300.dp)){
            Text(text = "Web",
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Cyan)

        }
        Spacer(modifier= Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_CALC)},
            modifier= Modifier.width(300.dp)){
            Text(text = "Calculator",
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Cyan)
        }
    }


}

@Preview
@Composable
private fun Home_Prev() {
    Home_Screen(rememberNavController())
    
}