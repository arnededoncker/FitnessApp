package com.example.fitnessapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.components.ExerciseList
import com.example.fitnessapp.components.Searchbar
import com.example.fitnessapp.ui.theme.FitnessappTheme
import data.Exercise

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {
    val exerciseList = Exercise.getAllExercises()

    Column(modifier = Modifier.padding(all = 16.dp), Arrangement.spacedBy(24.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "EXERCISES",
            color = Color.White,
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            style = TextStyle(
                letterSpacing = 1.sp, // Adjust letter spacing
                fontWeight = FontWeight.Light, // Adjust font weight
            ),
        )
        Searchbar()
        ExerciseList(exerciseList)
    }
}

@Preview
@Composable
fun DashboardScreenPreview() {
    FitnessappTheme {
        DashboardScreen()
    }
}
