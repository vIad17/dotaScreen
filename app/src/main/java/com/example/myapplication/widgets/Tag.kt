package com.example.myapplication.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable
fun Tag(tagName: String) {
    Surface(
        color = colorResource(R.color.d_tag_background).copy(alpha = 0.24f),
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
    ){
        Text(
            text = tagName.uppercase(),
            modifier = Modifier.padding(10.dp, 4.dp),
            color = colorResource(R.color.d_tag_text_color)
        )
    }
}