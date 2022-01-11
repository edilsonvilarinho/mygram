package br.com.edilsonvilarinho.mygram.di

import br.com.edilsonvilarinho.mygram.data.repository.PostRepository
import br.com.edilsonvilarinho.mygram.data.repository.PostRepositoryImpl
import org.koin.dsl.module

val postRepositoryModule = module {
    single<PostRepository> { PostRepositoryImpl(get()) }
}