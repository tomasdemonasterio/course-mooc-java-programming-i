/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.ArrayList;
 
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
 
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        this.items.add(item);
        if (this.totalWeight() > maximumWeight) {
            this.items.remove(item);
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        
        return sum;
    }
 
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    
}
 