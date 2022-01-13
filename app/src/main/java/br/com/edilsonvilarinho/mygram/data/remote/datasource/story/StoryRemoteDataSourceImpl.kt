package br.com.edilsonvilarinho.mygram.data.remote.datasource.story

import br.com.edilsonvilarinho.mygram.data.api.story.StoryService
import br.com.edilsonvilarinho.mygram.data.model.Story

class StoryRemoteDataSourceImpl(private val storyService: StoryService) : StoryRemoteDataSource {
    override suspend fun getStorys(): List<Story> {
        return storyService.getStorys()
    }
}