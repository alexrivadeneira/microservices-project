package com.example.recipesapi.controllers;

import com.example.recipesapi.models.Recipe;
import com.example.recipesapi.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RecipesController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public Iterable<Recipe> findAllRecipes(){
        return recipeRepository.findAll();
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe findRecipeById(@PathVariable Long recipeId){
        return recipeRepository.findOne(recipeId);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public HttpStatus deleteRecipeById(@PathVariable Long recipeId){
        recipeRepository.delete(recipeId);
        return HttpStatus.OK;
    }

    @PostMapping("/recipes")
    public Recipe newRecipe(@RequestBody Recipe newRecipe){
        return recipeRepository.save(newRecipe);
    }

}
