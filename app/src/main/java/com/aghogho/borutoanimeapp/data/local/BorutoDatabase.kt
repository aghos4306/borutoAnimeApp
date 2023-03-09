package com.aghogho.borutoanimeapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.aghogho.borutoanimeapp.data.local.dao.HeroDao
import com.aghogho.borutoanimeapp.data.local.dao.HeroRemoteKeyDao
import com.aghogho.borutoanimeapp.domain.model.Hero
import com.aghogho.borutoanimeapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteDeyDao(): HeroRemoteKeyDao

}
