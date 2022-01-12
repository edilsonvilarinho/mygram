package br.com.edilsonvilarinho.mygram.di

import br.com.edilsonvilarinho.mygram.data.repository.StoryRepository
import br.com.edilsonvilarinho.mygram.data.repository.StoryRepositoryImpl
import org.koin.dsl.module

val storyRepositoryModule = module {
    single<StoryRepository> { StoryRepositoryImpl(get(), get()) }
}