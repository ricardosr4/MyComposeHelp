package com.example.mycompose.model

import androidx.annotation.DrawableRes

data class SuperHeroModel(
    val superHeroName: String,
    val realName: String,
    val publisher: String,
   @DrawableRes val photo: Int

)
