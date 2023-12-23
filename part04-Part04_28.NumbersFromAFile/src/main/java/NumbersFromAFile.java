 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class NumbersFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int numberCount = 0;
        
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                int number = Integer.valueOf(file.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    numberCount++;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + numberCount);
    }
 
}
 