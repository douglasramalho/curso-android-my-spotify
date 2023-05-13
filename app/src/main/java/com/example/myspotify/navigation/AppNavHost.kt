package com.example.myspotify.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.account.loginNavigationRoute
import com.example.account.loginScreen

@Composable
fun AppNavHost(
    startDestination: String = loginNavigationRoute
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        loginScreen()
    }
}