package com.kat.recipe.controllers;

import com.kat.recipe.model.Category;
import com.kat.recipe.model.UnitOfMeasure;
import com.kat.recipe.repositories.CategoryRepository;
import com.kat.recipe.repositories.RecipeRepository;
import com.kat.recipe.repositories.UnitOfMeasureRepository;
import com.kat.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        log.debug("Getting Index Page");

        model.addAttribute("recipes", recipeService.getRecipes());


        return "index";
    }

}
