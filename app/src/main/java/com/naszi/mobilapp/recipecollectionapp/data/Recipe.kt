package com.naszi.mobilapp.recipecollectionapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe-table")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "recipe-title")
    val title: String = "",
    @ColumnInfo(name = "recipe-image")
    val image: String = "",
    @ColumnInfo(name = "recipe-description")
    val description: String = "",
    @ColumnInfo(name = "recipe-ingredients")
    val ingredients: String = ""
)
