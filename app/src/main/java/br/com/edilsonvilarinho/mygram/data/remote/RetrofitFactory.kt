package br.com.edilsonvilarinho.mygram.data.remote

import br.com.edilsonvilarinho.mygram.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val READ_TIMEOUT = 15L
private const val CONNECT_TIMEOUT = 2L

object RetrofitFactory {

    private fun createHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level =
                if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
//                else HttpLoggingInterceptor.Level.NONE
                else HttpLoggingInterceptor.Level.BODY
        }
    }

    private val okHttpClient: OkHttpClient = OkHttpClient.Builder().apply {
        addInterceptor(createHttpLoggingInterceptor())

        readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
        connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
    }.build()

    fun <T> build(baseUrl: String, apiClass: Class<T>): T {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(apiClass)
    }


}