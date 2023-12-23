 
import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int sumPositives = 0;
        
        while  (true) {
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == 0) {
                break;
            }
            if (value > 0) {
                positives++;
                sumPositives += value;
            }
        }
        if (positives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0*sumPositives/positives);
        }
    }
}
 