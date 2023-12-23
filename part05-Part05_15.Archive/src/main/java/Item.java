/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
public class Item {
    private String name;
    private String identifier;
 
    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item objItem = (Item) obj;
        
        return this.identifier.equals(objItem.identifier);
    }
 
    @Override
    public String toString() {
        return this.identifier + ": " + this.name; //To change body of generated methods, choose Tools | Templates.
    }
}
 