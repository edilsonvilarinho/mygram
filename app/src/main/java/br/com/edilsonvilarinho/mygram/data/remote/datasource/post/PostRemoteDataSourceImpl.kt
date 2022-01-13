package br.com.edilsonvilarinho.mygram.data.remote.datasource.post

import br.com.edilsonvilarinho.mygram.data.api.post.PostService
import br.com.edilsonvilarinho.mygram.data.model.Post

class PostRemoteDataSourceImpl(private val postService: PostService) : PostRemoteDataSource {
    override suspend fun getPosts(): List<Post> {
        return postService.getPosts()
    }
}