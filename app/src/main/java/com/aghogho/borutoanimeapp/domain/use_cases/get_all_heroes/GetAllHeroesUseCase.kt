package com.aghogho.borutoanimeapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.aghogho.borutoanimeapp.data.repository.Repository
import com.aghogho.borutoanimeapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}
