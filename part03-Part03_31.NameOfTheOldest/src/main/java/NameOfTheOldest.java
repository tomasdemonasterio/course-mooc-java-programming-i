 
import java.util.Scanner;
 
public class NameOfTheOldest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String maxName = "";
 
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] pieces = string.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > maxAge) {
                maxAge = age;
                maxName = pieces[0];
            }
        }
        System.out.println("Name of the oldes: " + maxName);
    }
}
 