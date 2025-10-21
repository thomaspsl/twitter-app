package com.example.twitter.models

data class Post(
    val author: String,
    val text: String,
    val photo: Int,
    val publishedDate: String,
    val stats: Int,
    val coms: Int,
    val share: Int,
    val likes: Int,
    var comments: List<String>
)
