package com.mohylov.myhealth.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mohylov.core.AppDestination
import com.mohylov.tracker.TrackerDestination
import com.mohylov.tracker.trackerGraph

/**
 * App top level navigation graph
 */
@Composable
fun MainNavHost(
    navHostController: NavHostController,
    onNavigateToDestination : (AppDestination, String?) -> Unit,
    onBackClick : () -> Unit,
    modifier : Modifier = Modifier,
    startDestination : String = TrackerDestination.route
){
    NavHost(
        navController = navHostController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        trackerGraph()

    }
}