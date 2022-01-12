package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.local.datasource.story.StoryLocalDataSource
import br.com.edilsonvilarinho.mygram.data.local.db.entity.toStory
import br.com.edilsonvilarinho.mygram.data.model.Story
import br.com.edilsonvilarinho.mygram.data.model.storyEntity
import br.com.edilsonvilarinho.mygram.data.remote.datasource.story.StoryRemoteDataSource

class StoryRepositoryImpl(
    private val storyRemoteDataSource: StoryRemoteDataSource,
    private val storyLocalDataSource: StoryLocalDataSource
) : StoryRepository {
    override suspend fun getStorys(): List<Story>? {
        val storyList = storyRemoteDataSource.getStorys()
        storyLocalDataSource.insert(storyList.map { it.storyEntity() })
        return storyLocalDataSource.get().map { it.toStory() }
    }

    override suspend fun getStorysLocalData(): List<Story>? {
        return storyLocalDataSource.get().map { it.toStory() }
    }
}