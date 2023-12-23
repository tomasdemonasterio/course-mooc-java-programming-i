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
 
public class Recipe {
 
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
 
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
 
    public Recipe() {
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }
 
    public Recipe(String[] recipePieces) {
        this.name = recipePieces[0];
        this.cookingTime = Integer.valueOf(recipePieces[1]);
        this.ingredients = new ArrayList<>();
        
        for (int i = 2; i < recipePieces.length; i++) {
            this.ingredients.add(recipePieces[i]);
        }
    }
 
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
 
    public int getCookingTime() {
        return cookingTime;
    }
 
    public String getName() {
        return name;
    }
 
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
    
    
 
}
 