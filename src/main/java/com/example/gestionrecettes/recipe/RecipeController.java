package com.example.gestionrecettes.recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public List<recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/")
    public recipe getRecipeById(@PathVariable Long id) {
        return recipeService.getRecipeById(id);
    }

    @PostMapping("addRecipe")
    public recipe addRecipe(@RequestBody recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @PutMapping("updateRecipe/{id}")
    public recipe updateRecipe(@PathVariable Long id, @RequestBody recipe recipe) {
        return recipeService.updateRecipe(id, recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
    }
}
