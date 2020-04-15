package com.aoher.service;

import com.aoher.model.Recipe;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RecipeService {

    /**
     * Add a new Recipe
     * @param recipe
     * @return new Recipe with generated id
     */
    Recipe addRecipe(Recipe recipe);

    /**
     * Delete a recipe using id
     * @param id
     */
    Recipe deleteRecipe(Long id, Long editor);

    /**
     * Update an exising recipe
     * @param recipe
     * @return updated recipe
     */
    Recipe  updateRecipe(Recipe recipe);

    /**
     * Get arecipe by id
     * @param id
     * @return
     */
    Recipe getRecipe(Long id);

    /**
     * Get all recipes
     * @return List<Recipe>
     */
    List<Recipe> getAllRecipes();

    /**
     * Returns the Page object containing the list of recipe with passed limit and page number
     * @param pageNumber
     * @param limit
     * @return Page
     */
    Page<Recipe> getRecipes(int pageNumber, int limit);
}
