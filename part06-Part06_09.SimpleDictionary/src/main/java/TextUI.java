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
 
public class TextUI {
 
    private Scanner scanner;
    private SimpleDictionary dictionary;
 
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
 
    public void start() {
        System.out.println("Command:");
        while (true) {
            String string = this.scanner.nextLine();
            if (string.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (string.equals("add")) {
                this.add();
                continue;
            }
            if (string.equals("search")) {
                this.search();
                continue;
            }
            System.out.println("Unknown command");
        }
    }
 
    public void add() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        System.out.println("Translation:");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated:");
        String search = this.scanner.nextLine();
        String translation = this.dictionary.translate(search);
        if (translation == null) {
            System.out.println("Word " + search + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
        
    }
}