package com.example.account

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val loginNavigationRoute = "login"

fun NavGraphBuilder.loginScreen() {
    composable(route = loginNavigationRoute) {
        LoginRoute()
    }
}