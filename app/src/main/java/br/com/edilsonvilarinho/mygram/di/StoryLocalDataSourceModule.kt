package br.com.edilsonvilarinho.mygram.di

import br.com.edilsonvilarinho.mygram.data.local.datasource.story.StoryLocalDataSource
import br.com.edilsonvilarinho.mygram.data.local.datasource.story.StoryLocalDataSourceImpl
import org.koin.dsl.module

val storyLocalDataSourceModule = module {
    single<StoryLocalDataSource> { StoryLocalDataSourceImpl(get()) }
}