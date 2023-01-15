package com.example.newapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.newapi.ui.theme.NewApiTheme
import com.jorgesanaguaray.consumeapijetpackcomposenavigationtutorial.ui.nav.SetupNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            NewApiTheme() {

                Surface(

                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {

                    val navController = rememberNavController()
                    SetupNavHost(navController = navController, gameViewModel = viewModel())

                }

            }

        }

    }

}