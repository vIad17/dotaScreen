package com.example.myapplication.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun Comment(userImage: Int, username: String, date: String, content: String) {
    Column {
        Row (
            modifier = Modifier.height(48.dp)
        ){
            Image(
                painter = painterResource(userImage),
                contentDescription = "$username photo",
                modifier = Modifier
                    .padding(top = 5.dp, end = 16.dp)
                    .size(36.dp)
                    .clip(CircleShape)
            )
            Column (
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                Text(
                    text = username,
                    color = Color.White,
                    fontSize = 16.sp,
                )
                Text(
                    text = date,
                    color = Color.White.copy(alpha = 0.4f),
                    fontSize = 16.sp,
                )
            }
        }
        Text(
            text = content,
            color = colorResource(R.color.medium_grey),
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
        Divider(
            color = colorResource(R.color.dark_grey),
            thickness = 1.dp,
            modifier = Modifier.padding(18.dp, 24.dp, 38.dp, 24.dp)
        )
    }
}