package com.anelcc.doglist.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getDosByBreeds(@Url url: String): Response<Dogs>
}