package com.aghogho.borutoanimeapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.aghogho.borutoanimeapp.util.Constants.HERO_DATABASE_TABLE

@Entity(tableName = HERO_DATABASE_TABLE)
data class Hero(
    @PrimaryKey(autoGenerate = false)  //each hero has unique id already in server
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: List<String>,
    val abilities: List<String>,
    val natureTypes: List<String>
)
