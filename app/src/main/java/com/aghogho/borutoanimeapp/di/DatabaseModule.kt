package com.aghogho.borutoanimeapp.di

import android.content.Context
import androidx.room.Room
import com.aghogho.borutoanimeapp.data.local.BorutoDatabase
import com.aghogho.borutoanimeapp.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideBorutoDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()

}
