package br.com.edilsonvilarinho.mygram.data.remote.datasource.story

import br.com.edilsonvilarinho.mygram.data.model.Story
import br.com.edilsonvilarinho.mygram.data.remote.Network

class StoryRemoteDataSourceImpl : StoryRemoteDataSource{
    override suspend fun getStorys(): List<Story> {
        return Network().storyService.getStorys()
    }
}