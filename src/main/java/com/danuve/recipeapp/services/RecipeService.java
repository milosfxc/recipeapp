package com.danuve.recipeapp.services;

import com.danuve.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipe();
}
