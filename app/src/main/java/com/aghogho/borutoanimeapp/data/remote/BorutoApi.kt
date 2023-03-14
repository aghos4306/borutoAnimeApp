package com.aghogho.borutoanimeapp.data.remote

import com.aghogho.borutoanimeapp.domain.model.BorutoApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BorutoApi {

    @GET("/boruto/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1
    ): BorutoApiResponse

    @GET("/boruto/heroes/search")
    suspend fun searchHeroes(
        @Query("name") name: String
    ): BorutoApiResponse

}
