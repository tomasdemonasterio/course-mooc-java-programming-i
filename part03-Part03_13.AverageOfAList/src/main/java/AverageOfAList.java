import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfAList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == -1) {
                break;
            }
            list.add(value);
        }
        int sum = 0;
        
        for (int number : list) {
            sum += number;
        }
        System.out.println("Average: " + (1.0*sum/list.size()));
    }
}
 