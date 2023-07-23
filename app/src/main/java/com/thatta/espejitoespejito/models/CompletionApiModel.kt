package com.thatta.espejitoespejito.models

import com.google.gson.annotations.SerializedName

data class CompletionApiModel(
    @SerializedName("model") var model: String = "text-davinci-003",
    @SerializedName("prompt") var prompt: String = "",
    @SerializedName("max_tokens") var maxTokens: Int = 5,
    @SerializedName("temperature") var temperature: Double = 0.7,
    @SerializedName("top_p") var topP: Double = 1.0,
    @SerializedName("n") var n: Int = 1,
    @SerializedName("stream") var stream: Boolean = false,
    @SerializedName("logprobs") var logrobs: String? = null,
    @SerializedName("stop") var stop: String = "\n"
)
