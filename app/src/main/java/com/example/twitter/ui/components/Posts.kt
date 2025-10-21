package com.example.twitter.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.twitter.models.Post
import com.example.twitter.R
import com.example.twitter.ui.theme.GreyTwitter

@Preview()
@Composable
fun Posts() {
    val posts: List<Post> = listOf(
        Post("Jack", "Ceci est le premier tweet de twitter", R.drawable.first, "", 23, 12, 50, 32, listOf()),
        Post("Jonas", "Ceci un tweet de fouuuur", R.drawable.second, "second", 23, 12, 50, 32, listOf()),
        Post("Marry", "j'adoooore ce trweeet", R.drawable.first, "", 23, 12, 50, 32, listOf()),
        Post("Marry", "j'adoooore ce trweeet", R.drawable.second, "", 23, 12, 50, 32, listOf())
    )

    Column(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
    ) {
        for (post in posts) {
            Post(post)
        }
    }
}