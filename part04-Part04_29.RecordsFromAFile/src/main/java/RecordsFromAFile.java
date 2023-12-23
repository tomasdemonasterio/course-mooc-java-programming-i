 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class RecordsFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String[] pieces = file.nextLine().split(",");
                int years = Integer.valueOf(pieces[1]);
                if (years != 1) {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " years");
                } else {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " year");
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 