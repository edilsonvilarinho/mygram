package br.com.edilsonvilarinho.mygram.data.local.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.edilsonvilarinho.mygram.data.model.Post

@Entity(tableName = "post")
data class PostEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "username")
    val username: String,
    @ColumnInfo(name = "img")
    val img: String = "",
    @ColumnInfo(name = "avatar")
    val avatar: String = "",
    @ColumnInfo(name = "likes")
    val likes: Int = 0,
    @ColumnInfo(name = "isLiked")
    val isLiked: Boolean = false,
    @ColumnInfo(name = "isBookMark")
    val isBookMark: Boolean = false,
)

fun PostEntity.toPost() = Post(
    id = id,
    username = username,
    img = img,
    avatar = avatar,
    likes = likes,
    isLiked = isLiked,
    isBookMark = isBookMark
)