package com.mohylov.splash

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mohylov.core.AppDestination

object SplashScreenDestination : AppDestination {

    override val route: String = "splash_screen_route"

    override val destination: String = "splash_screen_destination"

    fun NavGraphBuilder.splashGraph(
        navigateToTracker: () -> Unit,
        navigateToLogin: () -> Unit
    ) {
        composable(route = SplashScreenDestination.route) {
            SplashScreenRoute(
                navigateToLogin = navigateToLogin,
                navigateToTracker = navigateToTracker
            )
        }
    }

}
