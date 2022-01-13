package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.model.Story

interface PostRepository {
    suspend fun getAll(): List<Post>?
    suspend fun getPostsLocalData(): List<Post>?
}