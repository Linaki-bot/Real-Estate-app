package com.example.realestate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.realestate.ui.theme.screens.home.HomeScreen as HomeScreen1

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen1(navController = navController)
        }

        composable(ROUT_DETAIL) {
            HomeScreen1(navController = navController)
        }

        composable(ROUT_ABOUT) {
            HomeScreen1(navController = navController)
        }

        composable(ROUT_SPLASH) {
            HomeScreen1(navController = navController)
        }








    }
}