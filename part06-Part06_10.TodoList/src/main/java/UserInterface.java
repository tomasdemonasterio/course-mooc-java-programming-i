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
 
public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;
 
    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                this.add();
            }
            if (command.equals("list")) {
                this.list();
            }
            if (command.equals("remove")) {
                this.remove();
            }
        }
    }
    
    public void add() {
        System.out.println("To add:");
        this.todolist.add(scanner.nextLine());
    }
    
    public void list() {
        this.todolist.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        this.todolist.remove(Integer.valueOf(scanner.nextLine()));
    }
}
 