package com.danuve.recipeapp.controller;

import com.danuve.recipeapp.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final RecipeService recipeService;
    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /*
        private CategoryRepository categoryRepository;
        private UnitOfMeasureRepository unitOfMeasureRepository;
        @Autowired
        public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
            this.categoryRepository = categoryRepository;
            this.unitOfMeasureRepository = unitOfMeasureRepository;
        }
    */
    @GetMapping({"", "/","/index","/index.html"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipe());

        /*
        Optional<Category> optionalCategory = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println(optionalCategory.get().getId());
        System.out.println(unitOfMeasure.get().getId());
        */

        return "index";
    }
}
