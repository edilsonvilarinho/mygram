package br.com.edilsonvilarinho.mygram.data.local.datasource.story

import br.com.edilsonvilarinho.mygram.data.local.db.StoryDao
import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity

class StoryLocalDataSourceImpl(private val dao: StoryDao) : StoryLocalDataSource {
    override suspend fun getAll(): List<StoryEntity> {
        return dao.getAll()
    }

    override suspend fun insert(storyEntityList: List<StoryEntity>) {
        dao.insert(storyEntityList)
    }
}