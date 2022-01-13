package br.com.edilsonvilarinho.mygram.data.repository

import br.com.edilsonvilarinho.mygram.data.model.Story

interface StoryRepository {
    suspend fun getAll(): List<Story>?
    suspend fun getStorysLocalData(): List<Story>?
}