package com.mohylov.myhealth

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mohylov.myhealth.navigation.MainNavHost
import com.mohylov.myhealth.ui.theme.MyHealthTheme

@Composable
fun MyHealthApp (
    myHealthAppState: MyHealthAppState = rememberMyHealthAppState()
){

    MyHealthTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MainNavHost(
                navHostController = myHealthAppState.navController,
                onNavigateToDestination = myHealthAppState::navigate,
                onBackClick = myHealthAppState::onBackClick
            )
        }

    }
}