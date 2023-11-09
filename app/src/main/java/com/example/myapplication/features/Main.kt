package com.example.myapplication.features

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Main() {
    Column(modifier = Modifier.padding(start = 20.dp, top = 30.dp)) {
        Content()
        Review()
    }
}