package br.com.edilsonvilarinho.mygram.di


import br.com.edilsonvilarinho.mygram.BuildConfig
import br.com.edilsonvilarinho.mygram.data.api.post.PostService
import br.com.edilsonvilarinho.mygram.data.api.story.StoryService
import br.com.edilsonvilarinho.mygram.data.remote.RetrofitFactory
import org.koin.dsl.module

var networkModule = module {
    single {
        RetrofitFactory.build(
            BuildConfig.API_ENDPOINT,
            PostService::class.java
        )
    }

    single {
        RetrofitFactory.build(
            BuildConfig.API_ENDPOINT,
            StoryService::class.java
        )
    }
}