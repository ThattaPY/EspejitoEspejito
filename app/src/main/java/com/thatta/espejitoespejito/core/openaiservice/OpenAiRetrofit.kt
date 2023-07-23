package com.thatta.espejitoespejito.core.openaiservice

import com.thatta.espejitoespejito.models.OpenAiResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class OpenAiRetrofit {

    private val retrofit = GetOpenAiRetrofitService.getRetrofit()

    suspend fun getCompletionData(): OpenAiResponse {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(RetrofitApi::class.java).getCompletionData()
            response.body() ?: OpenAiResponse()
        }
    }

}