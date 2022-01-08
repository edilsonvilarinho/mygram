package br.com.edilsonvilarinho.mygram

class Post(
    val username: String,
    val img: String = "",
    val likes: Int = 0,
    val isLiked: Boolean = false,
    val isBookMark: Boolean = false,
)