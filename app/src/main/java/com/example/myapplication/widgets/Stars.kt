package com.example.myapplication.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.example.myapplication.widgets.Star

@Composable
fun Stars() {
    Row {
        Star()
        Star()
        Star()
        Star()
        Star()
    }
}