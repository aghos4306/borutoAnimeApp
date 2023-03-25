package com.aghogho.borutoanimeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aghogho.borutoanimeapp.domain.model.HeroRemoteKeys

@Dao
interface HeroRemoteKeysDao {

    @Query("SELECT * FROM hero_remote_keys_database_table WHERE id= :id")
    suspend fun getRemoteKeys(heroId: Int): HeroRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(heroRemoteKey: List<HeroRemoteKeys>)

    @Query("DELETE FROM hero_remote_keys_database_table")
    suspend fun deleteAllRemoteKeys()

}

