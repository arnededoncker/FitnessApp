package com.example.fitnessapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fitnessapp.ui.theme.FitnessappTheme
import data.Exercise

@ExperimentalMaterial3Api
@Composable
fun ExerciseList(exerciseList: List<Exercise>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(exerciseList) { exercise ->
            ExerciseCard(exercise.name, exercise.muscleGroup)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ExerciseListPreview() {
    val sampleExercises = listOf(
        Exercise("Push-ups", "Chest"),
        Exercise("Squats", "Legs"),
        Exercise("Dumbbell Curl", "Biceps"),
        Exercise("Plank", "Core"),
        Exercise("Pull-ups", "Back"),
        Exercise("Lunges", "Legs"),
        Exercise("Bench Press", "Chest"),
    )

    FitnessappTheme {
        ExerciseList(exerciseList = sampleExercises)
    }
}
