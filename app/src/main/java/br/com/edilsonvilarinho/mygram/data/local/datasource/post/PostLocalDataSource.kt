package br.com.edilsonvilarinho.mygram.data.local.datasource.post

import br.com.edilsonvilarinho.mygram.data.local.db.entity.PostEntity

interface PostLocalDataSource {
    suspend fun getAll(): List<PostEntity>
    suspend fun insert(userList: List<PostEntity>)
}