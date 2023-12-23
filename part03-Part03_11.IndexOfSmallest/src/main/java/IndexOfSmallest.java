 
import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 9999) {
                break;
            }
            list.add(value);
        }
 
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        printSmallest(list);
    }
    
    public static void printSmallest(ArrayList<Integer> list) {
        int min = list.get(0);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            
            if (number < min) {
                min = number;
                index = i;
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Found at index: " + index);
    }
}
 