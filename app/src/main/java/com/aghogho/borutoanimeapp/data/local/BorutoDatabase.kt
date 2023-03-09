package com.aghogho.borutoanimeapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aghogho.borutoanimeapp.data.local.dao.HeroDao
import com.aghogho.borutoanimeapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BorutoDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao

}
