package br.com.edilsonvilarinho.mygram.data.remote.datasource.post

import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.model.Story

interface PostRemoteDataSource {
    suspend fun getPosts(): List<Post>
}