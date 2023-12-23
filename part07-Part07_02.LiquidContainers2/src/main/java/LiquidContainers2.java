 
import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container liquidContainer1 = new Container();
        Container liquidContainer2 = new Container();
 
        while (true) {
            System.out.println("First: " + liquidContainer1.contains() + "/100");
            System.out.println("Second " + liquidContainer2.contains() + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] pieces = input.split(" ");
 
            if (pieces[0].equals("add")) {
                int value = Integer.valueOf(pieces[1]);
                liquidContainer1.add(value);
            }
            if (pieces[0].equals("move")) {
                int value = Integer.valueOf(pieces[1]);
                if (value > liquidContainer1.contains()) {
                    value = liquidContainer1.contains();
                }
                liquidContainer2.add(value);
                liquidContainer1.remove(value);
            }
            if (pieces[0].equals("remove")) {
                int value = Integer.valueOf(pieces[1]);
                liquidContainer2.remove(value);
            }
        }
 
    }
}