package com.kat.recipe.controllers;

import com.kat.recipe.model.Category;
import com.kat.recipe.model.UnitOfMeasure;
import com.kat.recipe.repositories.CategoryRepository;
import com.kat.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional =  unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is " + categoryOptional.get().getId());
        System.out.println("Unit of measure is " + unitOfMeasureOptional.get().getDescription());

        return "index";
    }

}
