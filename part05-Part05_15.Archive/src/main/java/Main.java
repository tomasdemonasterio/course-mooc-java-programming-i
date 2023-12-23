 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
 
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("name? (empty will stop)");
            String name = scanner.nextLine();
 
            if (name.isEmpty() ) {
                break;
            }
 
            items.add(new Item(name, identifier));
        }
        ArrayList<Item> printedItems = new ArrayList<>();
        for (Item item : items) {
            System.out.println("==Items==");
            if (!printedItems.contains(item)){
                System.out.println(item);
                printedItems.add(item);
            }
        }
    }
 
}