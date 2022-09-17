package com.mohylov.tracker

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mohylov.core.AppDestination

object TrackerDestination : AppDestination {
    override val route: String = "tracker_route"
    override val destination: String = "tracker_destination"


}

fun NavGraphBuilder.trackerGraph(){
    navigation(
        startDestination = TrackerDestination.destination,
        route = TrackerDestination.route
    ){
        composable(route = TrackerDestination.destination){
            TrackerRoute()
        }
    }
}