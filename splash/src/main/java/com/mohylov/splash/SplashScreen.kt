package com.mohylov.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SplashScreenRoute(
    modifier: Modifier = Modifier,
    navigateToLogin: () -> Unit,
    navigateToTracker: () -> Unit,
){

    SplashScreen(
        modifier = modifier,
        navigateToLogin = navigateToLogin,
        navigateToTracker = navigateToTracker
    )

}

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    navigateToLogin: () -> Unit,
    navigateToTracker: () -> Unit
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            modifier = Modifier
                .width(200.dp)
                .height(100.dp),
            onClick = navigateToTracker
        ){
            Text("Move to tracker")
        }

    }

}