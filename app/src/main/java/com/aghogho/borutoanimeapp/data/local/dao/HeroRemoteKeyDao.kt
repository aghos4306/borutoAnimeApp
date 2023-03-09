package com.aghogho.borutoanimeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aghogho.borutoanimeapp.domain.model.HeroRemoteKey

@Dao
interface HeroRemoteKeyDao {

    @Query("SELECT * FROM hero_remote_key_database_table WHERE id= :id")
    suspend fun getRemoteKey(id: Int): HeroRemoteKey

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(heroRemoteKey: List<HeroRemoteKey>)

    @Query("DELETE FROM hero_remote_key_database_table")
    suspend fun deleteAllRemoteKeys()

}
