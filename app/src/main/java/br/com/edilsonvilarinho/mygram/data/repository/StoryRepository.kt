package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.model.Story

interface StoryRepository {
    suspend fun getStorys(): List<Story>?
    suspend fun getStorysLocalData(): List<Story>?
}