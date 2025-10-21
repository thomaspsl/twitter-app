package com.example.twitter.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitter.R
import com.example.twitter.ui.theme.BlueTwitter
import com.example.twitter.ui.theme.GreyTwitter

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = BlueTwitter)
            .padding(horizontal = 20.dp)
            .height(50.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Profile photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(25.dp)
                .height(25.dp)
                .clip(RoundedCornerShape(15.dp))
        )

        Image(
            painter = painterResource(id = R.drawable.twitter_logo),
            contentDescription = "Profile photo",
            modifier = Modifier
                .width(25.dp)
                .height(25.dp),
        )

        Image(
            painter = painterResource(id = R.drawable.stars),
            contentDescription = "Profile photo",
            modifier = Modifier
                .width(25.dp)
                .height(25.dp),
        )
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Divider(
            thickness = 1.dp,
            color = GreyTwitter
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
     Header()
}