package br.com.edilsonvilarinho.mygram.data.remote.datasource.post

import br.com.edilsonvilarinho.mygram.data.model.Post
import br.com.edilsonvilarinho.mygram.data.remote.Network

class PostRemoteDataSourceImpl : PostRemoteDataSource {
    override suspend fun getPosts(): List<Post> {
        return Network().postService.getPosts()
    }
}