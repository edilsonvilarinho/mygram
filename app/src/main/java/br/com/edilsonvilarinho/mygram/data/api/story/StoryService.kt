package br.com.edilsonvilarinho.mygram.data.api.story

import br.com.edilsonvilarinho.mygram.data.model.Story
import retrofit2.http.GET

interface StoryService {
    @GET("storys")
    suspend fun getStorys(): List<Story>
}