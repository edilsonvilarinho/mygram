package br.com.edilsonvilarinho.mygram.data.model

import com.google.gson.annotations.SerializedName

class Story(
    @SerializedName("username") val username: String,
    @SerializedName("img") val img: String,
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("id") val id: String
)