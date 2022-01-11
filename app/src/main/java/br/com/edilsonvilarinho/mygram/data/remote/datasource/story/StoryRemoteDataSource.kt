package br.com.edilsonvilarinho.mygram.data.remote.datasource.story

import br.com.edilsonvilarinho.mygram.data.model.Story

interface StoryRemoteDataSource {
    suspend fun getStorys(): List<Story>
}