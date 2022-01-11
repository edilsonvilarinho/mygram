package br.com.edilsonvilarinho.mygram.di

import br.com.edilsonvilarinho.mygram.data.remote.datasource.story.StoryRemoteDataSource
import br.com.edilsonvilarinho.mygram.data.remote.datasource.story.StoryRemoteDataSourceImpl
import org.koin.dsl.module

var storyRemoteDataSourceModule = module {
    single<StoryRemoteDataSource> { StoryRemoteDataSourceImpl() }
}