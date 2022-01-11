package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.remote.datasource.post.PostRemoteDataSource

class PostRepositoryImpl(
    private val postRemoteDataSource: PostRemoteDataSource
) : PostRepository {
    override suspend fun getPosts(): List<Post>? {
        return postRemoteDataSource.getPosts()
    }
}