package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.remote.datasource.post.PostRemoteDataSource
import br.com.edilsonvilarinho.mygram.data.remote.datasource.post.PostRemoteDataSourceImpl

class PostRepositoryImpl(
    private val postRemoteDataSource: PostRemoteDataSource = PostRemoteDataSourceImpl()
) : PostRepository {
    override suspend fun getPosts(): List<Post>? {
        return postRemoteDataSource.getPosts()
    }
}