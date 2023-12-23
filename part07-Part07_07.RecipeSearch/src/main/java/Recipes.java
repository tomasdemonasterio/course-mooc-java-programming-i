/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
 
public class Recipes {
 
    private ArrayList<Recipe> recipes;
 
    public Recipes() {
        this.recipes = new ArrayList<>();
    }
 
    public void add(Recipe recipe) {
        recipes.add(recipe);
    }
 
    public void readRecipeFromFile(String fileName) {
        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {;
            String recipeLines = "";
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                recipeLines += string + ",";
            }
            String[] recipes = recipeLines.split(",,");
            System.out.println("recipes qty " + recipes.length);
            System.out.println(recipeLines);
            for (int i = 0; i < recipes.length; i++) {
                String[] recipePieces = recipes[i].split(",");
                if (recipePieces.length > 2) {
 
                    Recipe recipe = new Recipe(recipePieces);
                    this.add(recipe);
                }
 
            }
 
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
 
    public void list() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }
 
    public void findName(String name) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
 
    public void findByCookingTime(int maxCookingTime) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String ingredient) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }           
        }
    }
 
}
 