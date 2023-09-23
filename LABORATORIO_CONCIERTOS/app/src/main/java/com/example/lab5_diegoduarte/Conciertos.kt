package com.example.lab5_diegoduarte

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Conciertos(
    val name: String,
    val date: String,
    val image: Int,
    val des: String,
    val venue: String)
    : Parcelable