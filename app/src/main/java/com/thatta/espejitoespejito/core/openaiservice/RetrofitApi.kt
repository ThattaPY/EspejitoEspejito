package com.thatta.espejitoespejito.core.openaiservice

import com.thatta.espejitoespejito.models.CompletionApiModel
import com.thatta.espejitoespejito.models.OpenAiResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitApi {

    @POST("completions/{param}")
    fun getCompletionData(
        param: String?, @Body completionModel: CompletionApiModel
    ): Response<OpenAiResponse>

}