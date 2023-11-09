package com.example.myapplication.features

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.widgets.Comment

@Composable
fun Comments() {
    Column (
        modifier = Modifier.padding(top = 30.dp)
    ) {
        Comment(
            userImage = R.drawable.person1,
            username = "Auguste Conte",
            date = "February 14, 2019",
            content = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
        Comment(
            userImage = R.drawable.person2,
            username = "Jang Marcelino",
            date = "February 14, 2019",
            content = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    }
}