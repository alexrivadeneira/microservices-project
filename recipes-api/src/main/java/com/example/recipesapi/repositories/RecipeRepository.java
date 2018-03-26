package com.example.recipesapi.repositories;

import com.example.recipesapi.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>  {
}
