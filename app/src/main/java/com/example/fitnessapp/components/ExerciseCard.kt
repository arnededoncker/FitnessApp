package com.example.fitnessapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.ui.theme.FitnessappTheme

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
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Light,
            )
            Text(
                text = "Muscles: $muscleGroup",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun ExerciseCardPreview() {
    FitnessappTheme {
        ExerciseCard("DUMBELL CURL", "Biceps")
    }
}