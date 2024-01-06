package com.example.fitnessapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.ui.theme.FitnessappTheme
import data.Exercise

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessappTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier.fillMaxSize().background(Color.Black).padding(all = 8.dp),
                ) {
                    ExerciseList(exerciseList = Exercise.getAllExercises())
                }
            }
        }
    }
}

@Composable
fun ExerciseCard(name: String, muscleGroup: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(MaterialTheme.colorScheme.primary),
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(all = 15.dp),
        ) {
            Text(
                text = "$name",
                color = White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Light,
            )
            Text(
                text = "Muscles: $muscleGroup",
                color = White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
            )
        }
    }
}

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

@Preview(showBackground = false)
@Composable
fun ExercisePreview() {
    FitnessappTheme {
        ExerciseCard("DUMBELL CURL", "Biceps")
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
