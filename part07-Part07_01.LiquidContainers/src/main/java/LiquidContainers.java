 
import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liquidContainer1 = 0;
        int liquidContainer2 = 0;
 
        while (true) {
            System.out.println("First: " + liquidContainer1 + "/100");
            System.out.println("Second " + liquidContainer2 + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] pieces = input.split(" ");
 
            if (pieces[0].equals("add")) {
                int value = Integer.valueOf(pieces[1]);
                if (value > 0) {
                    if (liquidContainer1 + value > 100) {
                        liquidContainer1 = 100;
                    } else {
                        liquidContainer1 += value;
                    }
                }
            }
            if (pieces[0].equals("move")) {
                int value = Integer.valueOf(pieces[1]);
                if (value > liquidContainer1) {
                    value = liquidContainer1;
                }
                if (value > 0) {
                    if (liquidContainer2 + value > 100) {
                        liquidContainer2 = 100;
                    } else {
                        liquidContainer2 += value;
                    }
                }
                if (value < 0) {
                    value *= -1;
                }
                if (liquidContainer1 - value < 0) {
                    liquidContainer1 = 0;
                } else {
                    liquidContainer1 -= value;
                }
 
            }
            if (pieces[0].equals("remove")) {
                int value = Integer.valueOf(pieces[1]);
                if (value < 0) {
                    value *= -1;
                }
                if (liquidContainer2 - value < 0) {
                    liquidContainer2 = 0;
                } else {
                    liquidContainer2 -= value;
                }
            }
 
        }
    }
}
 