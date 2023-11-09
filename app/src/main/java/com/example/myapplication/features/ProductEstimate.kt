package com.example.myapplication.features

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.widgets.Stars

@Composable
fun ProductEstimate() {
    Row (
        modifier = Modifier
            .height(73.dp)
            .padding(top = 25.dp)
    ){
        Text(
            text = "4.9",
            color = Color.White,
            fontSize = 48.sp,
            modifier = Modifier.padding(end = 16.dp),
            style = LocalTextStyle.current.merge(
                TextStyle(
                    platformStyle = PlatformTextStyle(
                        includeFontPadding = false
                    ),
                )
            )
        )
        Column (
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Stars()
            Text(
                text = "70M Reviews",
                color = colorResource(R.color.medium_grey),
                fontSize = 12.sp,
            )
        }
    }
}