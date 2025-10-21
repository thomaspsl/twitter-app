package com.example.twitter.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.twitter.R
import com.example.twitter.models.Post
import com.example.twitter.ui.theme.GreyTwitter

@Composable
fun Post(post: Post) {
    Row(
        modifier = Modifier
            .padding(top = 10.dp, bottom = 10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Profile photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .clip(RoundedCornerShape(percent = 50))
        )

        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
            ){
                Row(){
                    Text(
                        post.author,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        " @" + post.author + "... • 2h",
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.End
                ){
                    Image(
                        painter = painterResource(id = R.drawable.menus),
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(18.dp)
                            .height(18.dp)
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
            ){
                Text(
                    post.text,
                    fontWeight = FontWeight.W300,
                    color = Color.White
                )
            }

            Spacer(Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
            ) {
                if(post.photo != 0){
                    Image(
                        painter = painterResource(id = post.photo),
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(end = 15.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.stats),
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(18.dp)
                            .height(18.dp)
                    )
                    Text(
                        "" + post.stats + "K",
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(end = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.messages),
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(18.dp)
                            .height(18.dp)
                    )
                    Text(
                        "" + post.coms,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(end = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.retweet),
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(18.dp)
                            .height(18.dp)
                    )
                    Text(
                        "" + post.share,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(end = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.heart),
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(18.dp)
                            .height(18.dp)
                    )
                    Text(
                        "" + post.stats,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(end = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.share),
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(18.dp)
                            .height(18.dp)
                    )
                }
            }
        }
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Divider(
            modifier = Modifier
                .fillMaxWidth(),
            thickness = 1.dp,
            color = GreyTwitter
        )
    }
}