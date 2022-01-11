package br.com.edilsonvilarinho.mygram.data.model

import com.google.gson.annotations.SerializedName

class Post(
    @SerializedName("username") val username: String,
    @SerializedName("img") val img: String = "",
    @SerializedName("avatar") val avatar: String = "",
    @SerializedName("likes") val likes: Int = 0,
    @SerializedName("isLiked") val isLiked: Boolean = false,
    @SerializedName("isBookMark") val isBookMark: Boolean = false,
)