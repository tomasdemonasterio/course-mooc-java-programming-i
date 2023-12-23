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
    private BirdsDatabase birdsDatabase;
 
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdsDatabase = new BirdsDatabase();
    }
 
    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
 
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin");
                String latinName = scanner.nextLine();
                birdsDatabase.add(new Bird(name, latinName));
            }
 
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String observation = scanner.nextLine();
                birdsDatabase.observation(observation);
            }
            
            if (command.equals("All")) {
                birdsDatabase.all();
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                birdsDatabase.printOne(name);
            }
            
            if (command.equals("Quit")) {
                break;
            }
        }
    }
 
}