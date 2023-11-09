package com.example.myapplication.features

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.widgets.Tag

@Composable
fun Tags() {
    Row (
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(start = 20.dp, top = 16.dp)
    ){
        Tag(tagName = "MOBA")
        Tag(tagName = "multiplayer")
        Tag(tagName = "strategy")
    }
}