package com.thatta.espejitoespejito.models

import com.google.gson.annotations.SerializedName

data class OpenAiResponse(
    @SerializedName("choices") var choices: ArrayList<Choices> = arrayListOf(),
    @SerializedName("created") var created: Int? = null,
    @SerializedName("id") var id: String? = null,
    @SerializedName("model") var model: String? = null,
    @SerializedName("object") var object_request: String? = null,
    @SerializedName("usage") var usage: Usage? = Usage()
)


data class Choices(
    @SerializedName("finish_reason") var finishReason: String? = null,
    @SerializedName("index") var index: Int? = null,
    @SerializedName("logprobs") var logprobs: String? = null,
    @SerializedName("text") var text: String? = null
)

data class Usage(
    @SerializedName("completion_tokens") var completionTokens: Int? = null,
    @SerializedName("prompt_tokens") var promptTokens: Int? = null,
    @SerializedName("total_tokens") var totalTokens: Int? = null
)