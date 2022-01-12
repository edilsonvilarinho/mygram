package br.com.edilsonvilarinho.mygram.data.local.datasource.post

import br.com.edilsonvilarinho.mygram.data.local.db.PostDao
import br.com.edilsonvilarinho.mygram.data.local.db.entity.PostEntity

class PostLocalDataSourceImpl(private val dao: PostDao) : PostLocalDataSource {
    override suspend fun getAll(): List<PostEntity> {
        return dao.getAll()
    }

    override suspend fun insert(postList: List<PostEntity>) {
        postList.forEach {
            dao.insert(it)
        }
    }
}