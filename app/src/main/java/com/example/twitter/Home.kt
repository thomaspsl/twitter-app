package com.example.twitter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.twitter.ui.components.Header
import com.example.twitter.ui.components.Posts
import com.example.twitter.ui.theme.BlueTwitter
import com.example.twitter.ui.theme.TwitterTheme

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = BlueTwitter)
            .verticalScroll(rememberScrollState())
    ) {
        Header()
        Posts()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TwitterTheme {
        Home()
    }
}