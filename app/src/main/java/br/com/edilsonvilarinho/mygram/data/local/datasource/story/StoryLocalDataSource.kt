package br.com.edilsonvilarinho.mygram.data.local.datasource.story

import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity

interface StoryLocalDataSource {
    suspend fun get(): List<StoryEntity>
    suspend fun insert(userList: List<StoryEntity>)
}