package com.aghogho.borutoanimeapp.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.aghogho.borutoanimeapp.data.local.BorutoDatabase
import com.aghogho.borutoanimeapp.data.paging_source.HeroRemoteMediator
import com.aghogho.borutoanimeapp.data.remote.BorutoApi
import com.aghogho.borutoanimeapp.domain.model.Hero
import com.aghogho.borutoanimeapp.domain.model.HeroRemoteKeys
import com.aghogho.borutoanimeapp.domain.repository.RemoteDataSource
import com.aghogho.borutoanimeapp.util.Constants.NO_OF_ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow

@OptIn(ExperimentalPagingApi::class)
class RemoteDataSourceImpl(
    private val borutoApi: BorutoApi,
    private val borutoDatabase: BorutoDatabase
): RemoteDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        val pagingSourceFactory = { heroDao.getAllHeroes() }
        return Pager(
            config = PagingConfig(pageSize = NO_OF_ITEMS_PER_PAGE),
            remoteMediator = HeroRemoteMediator(
                borutoApi = borutoApi,
                borutoDatabase = borutoDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override fun searchHeroes(): Flow<PagingData<Hero>> {
        TODO("Not yet implemented")
    }
}
