package com.mohylov.myhealth

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mohylov.core.AppDestination

@Composable
fun rememberMyHealthAppState(
    navController: NavHostController = rememberNavController()
): MyHealthAppState {
    return remember(navController) {
        MyHealthAppState(navController)
    }
}

@Stable
class MyHealthAppState(val navController: NavHostController) {

    fun navigate(appDestination: AppDestination, route: String? = null) {
        navController.navigate(route ?: appDestination.route)
    }

    fun onBackClick() {
        navController.popBackStack()
    }

}