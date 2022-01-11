package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.model.Story
import br.com.edilsonvilarinho.mygram.data.remote.datasource.story.StoryRemoteDataSource
import br.com.edilsonvilarinho.mygram.data.remote.datasource.story.StoryRemoteDataSourceImpl

class StoryRepositoryImpl(
    private val userStoryRemoteDataSource: StoryRemoteDataSource = StoryRemoteDataSourceImpl()
) : StoryRepository {
    override suspend fun getStorys(): List<Story>? {
        return userStoryRemoteDataSource.getStorys()
    }
}