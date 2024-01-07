package com.example.fitnessapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fitnessapp.R
import com.example.fitnessapp.ui.theme.FitnessappTheme

@Composable
fun BottomBar() {
    BottomAppBar(modifier = Modifier.height(IntrinsicSize.Min), containerColor = Color.Black) {
        Row(modifier = Modifier.padding(all = 8.dp).fillMaxSize(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Icon(
                painter = painterResource(id = R.drawable.dumbell),
                contentDescription = "dumbell icon",
                tint = Color.White,
                modifier = Modifier.size(36.dp),
            )
            Icon(
                painter = painterResource(id = R.drawable.clipboard),
                contentDescription = "clipboard icon",
                tint = Color.White,
                modifier = Modifier.size(36.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    FitnessappTheme {
        BottomBar()
    }
}
