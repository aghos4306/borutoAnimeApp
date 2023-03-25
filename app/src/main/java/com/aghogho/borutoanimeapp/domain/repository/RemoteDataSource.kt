package com.aghogho.borutoanimeapp.data.repository

import androidx.paging.PagingData
import com.aghogho.borutoanimeapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {

    fun getAllData(): Flow<PagingData<Hero>>
    fun searchHeroes(): Flow<PagingData<Hero>>

}
