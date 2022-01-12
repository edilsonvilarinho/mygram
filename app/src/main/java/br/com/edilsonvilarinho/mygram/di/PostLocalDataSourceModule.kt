package br.com.edilsonvilarinho.mygram.di

import br.com.edilsonvilarinho.mygram.data.local.datasource.post.PostLocalDataSource
import br.com.edilsonvilarinho.mygram.data.local.datasource.post.PostLocalDataSourceImpl
import org.koin.dsl.module

var postLocalDataSourceModule = module {
    single<PostLocalDataSource> { PostLocalDataSourceImpl(get()) }
}