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
    override suspend fun getAll(): List<Story>? {
        return try {
            val storyList = storyRemoteDataSource.getStorys()
            storyLocalDataSource.insert(storyList.map { it.storyEntity() })
            storyLocalDataSource.getAll().map { it.toStory() }
        } catch (e: Exception) {
            storyLocalDataSource.getAll().map { it.toStory() }
        }
    }

    override suspend fun getStorysLocalData(): List<Story>? {
        return storyLocalDataSource.getAll().map { it.toStory() }
    }
}