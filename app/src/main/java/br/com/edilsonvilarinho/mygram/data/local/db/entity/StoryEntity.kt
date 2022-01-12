package br.com.edilsonvilarinho.mygram.data.local.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.edilsonvilarinho.mygram.data.model.Story

@Entity(tableName = "story")
data class StoryEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "username")
    val username: String,
    @ColumnInfo(name = "img")
    val img: String,
    @ColumnInfo(name = "createdAt")
    val createdAt: String
)

fun StoryEntity.toStory() = Story(
    id = id,
    username = username,
    img = img,
    createdAt = createdAt
)