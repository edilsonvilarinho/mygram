package br.com.edilsonvilarinho.mygram.data.model

import br.com.edilsonvilarinho.mygram.data.local.db.entity.PostEntity
import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("id") val id: Int,
    @SerializedName("username") val username: String,
    @SerializedName("img") val img: String = "",
    @SerializedName("avatar") val avatar: String = "",
    @SerializedName("likes") val likes: Int = 0,
    @SerializedName("isLiked") val isLiked: Boolean = false,
    @SerializedName("isBookMark") val isBookMark: Boolean = false,
)

fun Post.postEntity() = PostEntity(
    id = id,
    username = username,
    img = img,
    avatar = avatar,
    likes = likes,
    isLiked = isLiked,
    isBookMark = isBookMark
)