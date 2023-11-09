package com.example.myapplication.widgets

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Star() {
    Icon(
        imageVector = Icons.Default.Star,
        contentDescription = "Person Icon",
        tint = Color.Yellow,
        modifier = Modifier.size(18.dp)
    )
}