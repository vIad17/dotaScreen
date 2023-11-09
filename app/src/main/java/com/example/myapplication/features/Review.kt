package com.example.myapplication.features

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun Review() {
    Column (
        modifier = Modifier.padding(top = 24.dp)
    ){
        Text(
            "Review & Ratings",
            color = colorResource(R.color.light_grey),
            fontSize = 16.sp
        )
        ProductEstimate()
        Comments()
    }
}