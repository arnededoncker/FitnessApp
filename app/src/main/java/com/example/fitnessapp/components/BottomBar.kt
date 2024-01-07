package com.example.fitnessapp.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitnessapp.ui.theme.FitnessappTheme

@Composable
fun BottomBar() {
    BottomAppBar(containerColor = Color.Black) {
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    FitnessappTheme {
        BottomBar()
    }
}
