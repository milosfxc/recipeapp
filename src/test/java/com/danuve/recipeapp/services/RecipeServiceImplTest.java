package com.danuve.recipeapp.services;

import com.danuve.recipeapp.domain.Recipe;
import com.danuve.recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() throws Exception{
        MockitoAnnotations.openMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipe() throws Exception {
        Recipe recipe = new Recipe();
        Recipe recipe1 = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);
        when(recipeRepository.findAll()).thenReturn(recipesData);
        Set<Recipe> recipes = recipeService.getRecipe();
        System.out.println(recipes.size());
        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }
}