 
import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
 
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statisticsSum = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        while (true) {
            System.out.println("Enter numbers:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == - 1) {
                break;
            }
            statisticsSum.addNumber(value);
            if(value % 2 == 0) {
                statisticsEven.addNumber(value);
            } else {
                statisticsOdd.addNumber(value);
            }
        }
        System.out.print("Sum: " + statisticsSum.sum());
        System.out.print("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}