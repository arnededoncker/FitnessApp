package com.example.fitnessapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.fitnessapp.components.BottomBar
import com.example.fitnessapp.screens.DashboardScreen
import com.example.fitnessapp.ui.theme.FitnessappTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessappTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = { BottomBar() },

                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                        DashboardScreen()
                    }
                }
            }
        }
    }
}
