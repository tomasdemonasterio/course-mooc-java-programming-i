/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
public class Bird {
    String name;
    String latinName;
    int observation;
    
 
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public void observation(String observation) {
        if (this.name.equals(observation)) {
            this.observation++;
        }
        
        if (observation.equals("All")) {
            this.observation++;
        }
    }
 
    public String getName() {
        return name;
    }
 
    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "):" + this.observation + " observations";
    }
}