package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.local.datasource.post.PostLocalDataSource
import br.com.edilsonvilarinho.mygram.data.local.db.entity.toPost
import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.model.postEntity
import br.com.edilsonvilarinho.mygram.data.remote.datasource.post.PostRemoteDataSource

class PostRepositoryImpl(
    private val postRemoteDataSource: PostRemoteDataSource,
    private val postLocalDataSource: PostLocalDataSource
) : PostRepository {
    override suspend fun getPosts(): List<Post>? {
        val postList = postRemoteDataSource.getPosts()
        postLocalDataSource.insert(postList.map { it.postEntity() })
        return postLocalDataSource.getAll().map { it.toPost() }
    }

    override suspend fun getPostsLocalData(): List<Post>? {
        return postLocalDataSource.getAll().map { it.toPost() }
    }
}