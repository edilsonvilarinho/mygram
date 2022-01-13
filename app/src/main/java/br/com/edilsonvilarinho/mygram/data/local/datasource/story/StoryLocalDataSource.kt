package br.com.edilsonvilarinho.mygram.data.local.datasource.story

import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity

interface StoryLocalDataSource {
    suspend fun getAll(): List<StoryEntity>
    suspend fun insert(storyEntityList:List<StoryEntity>)
}