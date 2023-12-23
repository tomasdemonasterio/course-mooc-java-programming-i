 
import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestNameLength = 0;
        int sumBirthYears = 0;
        int namesCounter = 0;
        String longestName = "";
        
        
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] pieces = string.split(",");
            if (pieces[0].length() > longestNameLength) {
                longestName = pieces[0];    
                longestNameLength = pieces[0].length();
            }
            sumBirthYears += Integer.valueOf(pieces[1]);
            namesCounter++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumBirthYears / namesCounter));
    }
}
 