import java.util.ArrayList;
 
public class SimpleCollection {
 
    private String name;
    private ArrayList<String> elements;
 
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
 
    public void add(String element) {
        this.elements.add(element);
    }
 
    public ArrayList<String> getElements() {
        return this.elements;
    }
 
    public String toString() {
        String string = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return string + " is empty.";
        }
        if (this.elements.size() == 1) {
            return string + " has " + this.elements.size() + " element:\n" + this.elements.get(0);
        }
        string += " has " + this.elements.size() + " elements:\n";
        for (String elem : this.elements) {
            string += elem + "\n";
        }
        return string;
    }
    
}