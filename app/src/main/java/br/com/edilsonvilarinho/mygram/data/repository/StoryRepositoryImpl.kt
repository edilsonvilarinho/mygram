package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.model.Story
import br.com.edilsonvilarinho.mygram.data.remote.datasource.story.StoryRemoteDataSource

class StoryRepositoryImpl(
    private val userStoryRemoteDataSource: StoryRemoteDataSource
) : StoryRepository {
    override suspend fun getStorys(): List<Story>? {
        return userStoryRemoteDataSource.getStorys()
    }
}