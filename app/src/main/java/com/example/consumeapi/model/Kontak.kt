package com.example.consumeapi.model

import kotlinx.serialization.SerialName


data class Kontak(
    val id : Int,
    @SerialName(value = "nama")
    val nama : String,
    @SerialName(value = "email")
    val alamat : String,
    @SerialName(value = "nohp")
    val telpon : String,

)
