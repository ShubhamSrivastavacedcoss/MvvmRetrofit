package com.example.retrofitkotlin.repository


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.retrofitkotlin.api.QuoteApi

import com.example.retrofitkotlin.newmodels.PageResponse


class QuoteRepository(private val quoteApi: QuoteApi) {


    var quoteMutableData= MutableLiveData<PageResponse>()

    val quotes: LiveData<PageResponse>
    get() = quoteMutableData

    suspend fun getQuotes(page: Int){
        val result= quoteApi.getQuotes(page)

        if (result?.body() != null){
            quoteMutableData.postValue(result.body())
        }

    }


}