/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.Scanner;
import java.util.ArrayList;
 
public class UserInterface {
 
    private Scanner scanner;
    private Recipes recipes;
 
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new Recipes();
    }
 
    public void start() {
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        recipes.readRecipeFromFile(fileName);
 
        while (true) {
 
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("Enter command:");
            String command = scanner.nextLine();
 
            if (command.equals("find name")) {
                System.out.println("Searched word:");
                recipes.findName(scanner.nextLine());
            }
 
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                recipes.findByCookingTime(Integer.valueOf(scanner.nextLine()));
            }
            
            if (command.equals("find ingredient")) {
                System.out.println("ingredient:");
                recipes.findByIngredient(scanner.nextLine());
            }
 
            if (command.equals("list")) {
                recipes.list();
            }
 
            if (command.equals("stop")) {
                break;
            }
        }
    }
 
}