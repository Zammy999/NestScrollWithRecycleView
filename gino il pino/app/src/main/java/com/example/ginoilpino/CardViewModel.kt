package com.example.ginoilpino

class CardViewModel (
    private val image: String,
    private val name: String,
        ) {

    fun getName() = this.name
    fun getImage() = this.image
}