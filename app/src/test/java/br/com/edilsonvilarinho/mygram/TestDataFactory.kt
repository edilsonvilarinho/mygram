package br.com.edilsonvilarinho.mygram

import br.com.edilsonvilarinho.mygram.data.local.db.entity.PostEntity
import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity
import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.model.Story

object TestDataFactory {

    fun postEntityList() = listOf(
        PostEntity(
            id = 1,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        ),
        PostEntity(
            id = 2,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        ),
        PostEntity(
            id = 3,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        ),
        PostEntity(
            id = 4,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        )
    )

    fun storyEntityList() = listOf(
        StoryEntity(
            id = 1,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
        StoryEntity(
            id = 2,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
        StoryEntity(
            id = 3,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
        StoryEntity(
            id = 4,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
    )

    fun postResponseList() = listOf(
        Post(
            id = 1,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        ),
        Post(
            id = 2,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        ),
        Post(
            id = 3,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        ),
        Post(
            id = 4,
            username = "username",
            img = "img",
            avatar = "avatar",
            likes = 100,
            isLiked = false,
            isBookMark = false
        )
    )

    fun storyResponseList() = listOf(
        Story(
            id = 1,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
        Story(
            id = 2,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
        Story(
            id = 3,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
        Story(
            id = 4,
            username = "username",
            img = "img",
            createdAt = "createdAt"
        ),
    )
}