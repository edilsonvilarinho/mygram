package br.com.edilsonvilarinho.mygram.di

import br.com.edilsonvilarinho.mygram.data.remote.datasource.post.PostRemoteDataSource
import br.com.edilsonvilarinho.mygram.data.remote.datasource.post.PostRemoteDataSourceImpl
import org.koin.dsl.module

var postRemoteDataSourceModule = module {
    single<PostRemoteDataSource> { PostRemoteDataSourceImpl() }
}