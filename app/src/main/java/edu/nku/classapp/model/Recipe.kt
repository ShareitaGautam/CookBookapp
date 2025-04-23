package edu.nku.classapp.model

data class Recipe(
    val id: String,
    val name: String,
    val ingredients: String,
    val steps: String,
    var isFavorite: Boolean = false,
    val time: String
)
