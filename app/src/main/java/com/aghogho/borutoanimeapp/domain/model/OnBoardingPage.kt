package com.aghogho.borutoanimeapp.domain.model

import androidx.annotation.DrawableRes
import com.aghogho.borutoanimeapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First: OnBoardingPage(
        image = R.drawable.ic_logo,
        title = "Greetings",
        description = "Are you a Boruto fan? Because if you are, we have a great news for you"
    )
}
