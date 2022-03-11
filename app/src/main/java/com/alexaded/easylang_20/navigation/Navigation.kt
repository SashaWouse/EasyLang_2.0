package com.alexaded.easylang_20.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexaded.easylang_20.presentation.composables.MainScreenView
import com.alexaded.easylang_20.presentation.composables.ProgressScreenView


@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreenView(navController = navController)
        }

        composable(route = Screen.ProgressScreen.route) {
            ProgressScreenView(navController = navController)
        }

//        composable(route = Screen.ScanScreen.route) {
//            MLKitTextRecognition(navController = navController)
//        }
    }
}