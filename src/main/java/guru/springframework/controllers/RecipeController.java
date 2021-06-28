package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author malwina.k on 24.06.2021
 */
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getRecipeSet(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }



}
