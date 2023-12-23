 
import java.util.ArrayList;
 
public class BirdsDatabase {
 
    ArrayList<Bird> birds;
 
    public BirdsDatabase() {
        this.birds = new ArrayList<>();
    }
 
    public void add(Bird bird) {
        birds.add(bird);
    }
 
    public void observation(String observation) {
        for (Bird bird : birds) {
            bird.observation(observation);
        }
 
        if (findByName(observation)) {
            System.out.println("Not a bird!");
        }
    }
 
    public boolean findByName(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
 
    public void all() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
 
    public void printOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
 
}
 