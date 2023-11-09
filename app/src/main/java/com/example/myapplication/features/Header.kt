package com.example.myapplication.features

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myapplication.R
import com.example.myapplication.widgets.Stars

@Composable
fun Header() {
    ConstraintLayout {
        val (headerImg, logo) = createRefs()
        Image(
            painter = painterResource(R.drawable.header_sqr_img),
            contentDescription = "product image",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(headerImg) {}
        )
        Row (
            modifier = Modifier
                .constrainAs(logo) {
                    top.linkTo(headerImg.bottom, margin = (-30).dp)
                },
        ) {
            Surface(
                color = colorResource(R.color.black),
                modifier = Modifier
                    .size(120.dp, 90.dp)
                    .padding(start = 20.dp, end = 10.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .border(
                        2.dp,
                        color = colorResource(R.color.d_logo_border),
                        RoundedCornerShape(15.dp)
                    )
            ) {
                Image(
                    painter = painterResource(R.drawable.header_logo),
                    contentDescription = "logo image",
                    modifier = Modifier.padding(15.dp, 15.dp)
                )
            }
            Column (
                modifier = Modifier.height(85.dp),
                verticalArrangement = Arrangement.Bottom
            ){
                Text(
                    text = "DoTA 2",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Row (verticalAlignment = Alignment.CenterVertically){
                    Stars()
                    Text(
                        text = "70M",
                        color = colorResource(R.color.grey),
                        fontSize = 15.sp,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
            }
        }
    }
    Tags()
}