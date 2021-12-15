package com.example.retrofitkotlin.api

import com.example.retrofitkotlin.models.QuoteList
import com.example.retrofitkotlin.newmodels.PageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApi {

    @GET("/api/users")
    suspend fun getQuotes(@Query("page") page: Int): Response<PageResponse>
}