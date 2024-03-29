package com.aghogho.borutoanimeapp.domain.repository

import androidx.paging.PagingData
import com.aghogho.borutoanimeapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {

    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(): Flow<PagingData<Hero>>

}
