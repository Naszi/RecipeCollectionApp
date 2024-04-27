package com.naszi.mobilapp.recipecollectionapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class RecipeDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addRecipe(recipeEntity: Recipe)

    @Query("SELECT * FROM `recipe-table`")
    abstract fun getAllRecipes(): Flow<List<Recipe>>

    @Update
    abstract suspend fun updateRecipe(recipeEntity: Recipe)

    @Delete
    abstract suspend fun deleteRecipe(recipeEntity: Recipe)

    @Query("SELECT * FROM `recipe-table` WHERE id=:id")
    abstract fun getRecipeById(id: Long): Flow<Recipe>
}