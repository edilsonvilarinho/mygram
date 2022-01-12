package br.com.edilsonvilarinho.mygram.data.model

import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity
import com.google.gson.annotations.SerializedName

data class Story(
    @SerializedName("username") val username: String,
    @SerializedName("img") val img: String,
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("id") val id: Int
)

fun Story.storyEntity() = StoryEntity(
    id = id,
    username = username,
    img = img,
    createdAt = createdAt
)