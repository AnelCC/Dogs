package com.anelcc.doglist.data

import com.google.gson.annotations.SerializedName

data class Dogs(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
    )
