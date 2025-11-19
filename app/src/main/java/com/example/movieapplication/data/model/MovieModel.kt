package com.example.movieapplication.data.model

import java.io.Serializable

data class MovieModel(
    val img: String,
    val name: String,
    val desc: String,
    val info: String
): Serializable