package br.com.edilsonvilarinho.mygram.data.remote

import br.com.edilsonvilarinho.mygram.data.api.post.PostService
import br.com.edilsonvilarinho.mygram.data.api.story.StoryService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    val retrofitClient =
        Network.getRetrofitInstance("https://61dcc660591c3a0017e1aa71.mockapi.io/")
    val storyService = retrofitClient.create(StoryService::class.java)
    val postService = retrofitClient.create(PostService::class.java)

    companion object {
        fun getRetrofitInstance(path: String): Retrofit {
            return Retrofit.Builder()
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}