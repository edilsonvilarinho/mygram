package br.com.edilsonvilarinho.mygram

import android.app.Application
import br.com.edilsonvilarinho.mygram.di.postRemoteDataSourceModule
import br.com.edilsonvilarinho.mygram.di.postRepositoryModule
import br.com.edilsonvilarinho.mygram.di.storyRemoteDataSourceModule
import br.com.edilsonvilarinho.mygram.di.storyRepositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class MyApplication : Application() {

    private val modules = listOf(
        mainViewModelModule,
        postRemoteDataSourceModule,
        postRepositoryModule,
        storyRemoteDataSourceModule,
        storyRepositoryModule
    )

    override fun onCreate() {
        super.onCreate()
        // start Koin!
        GlobalContext.startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(modules)
        }
    }


}