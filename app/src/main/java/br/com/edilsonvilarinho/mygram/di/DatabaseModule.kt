package br.com.edilsonvilarinho.mygram.di

import br.com.edilsonvilarinho.mygram.data.local.db.AppDatabase
import br.com.edilsonvilarinho.mygram.data.local.db.AppDatabase.Companion.getDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

var databaseModule = module {
    single { get<AppDatabase>().postDao() }
    single { get<AppDatabase>().storyDao() }

    single { getDatabase(context = androidContext()) }
}