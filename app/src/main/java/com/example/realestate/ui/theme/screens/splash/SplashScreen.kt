package com.example.realestate.ui.theme.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.ui.theme.lightpink

@Composable
fun HomeScreen(navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .background(lightpink),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {


    }
}
@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

    com.example.realestate.ui.theme.screens.home.HomeScreen(rememberNavController())

}
