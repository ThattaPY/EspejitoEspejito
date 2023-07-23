package com.thatta.espejitoespejito.core.openaiservice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object GetOpenAiRetrofitService {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.openai.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
