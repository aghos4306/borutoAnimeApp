package com.aghogho.borutoanimeapp.domain.use_cases.save_onboarding

import com.aghogho.borutoanimeapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed = completed)
    }

}
