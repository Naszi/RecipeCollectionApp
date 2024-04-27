package com.naszi.mobilapp.recipecollectionapp.data

import kotlinx.coroutines.flow.Flow

class RecipeRepository(
    private val recipeDao: RecipeDao
) {
    suspend fun addRecipe(recipe: Recipe) {
        recipeDao.addRecipe(recipe)
    }

    fun getAllRecipes(): Flow<List<Recipe>> = recipeDao.getAllRecipes()

    fun getRecipeById(id: Long): Flow<Recipe> {
        return recipeDao.getRecipeById(id)
    }

    suspend fun updateRecipe(recipe: Recipe) {
        recipeDao.updateRecipe(recipe)
    }

    suspend fun deleteRecipe(recipe: Recipe) {
        recipeDao.deleteRecipe(recipe)
    }
}