package com.aghogho.borutoanimeapp.domain.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
data class BorutoApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList()
)
