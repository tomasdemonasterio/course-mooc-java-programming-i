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
 
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
 
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        this.suitcases.add(suitcase);
        if(this.totalWeight() > this.maximumWeight) {
            this.suitcases.remove(suitcase);
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Suitcase suitcase : this.suitcases) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}