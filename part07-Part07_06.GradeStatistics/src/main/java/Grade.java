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
 
public class Grade {
 
    ArrayList<Integer> points;
    ArrayList<Integer> passing;
 
    public Grade() {
        this.points = new ArrayList<>();
        this.passing = new ArrayList<>();
    }
 
    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
            if (points >= 50) {
                this.passing.add(points);
            }
 
        }
 
    }
 
    public double average() {
        return this.averageOfArray(this.points);
    }
 
    public int sum(ArrayList<Integer> array) {
        int sum = 0;
 
        for (int value : array) {
            sum += value;
        }
 
        return sum;
    }
 
    public double averageOfArray(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return -1;
        }
        return 1.0 * this.sum(array) / array.size();
    }
 
    public double passingAverage() {
        return this.averageOfArray(this.passing);
    }
 
    public double passPercentage() {
        System.out.println(passing.size() + " : " + points.size());
        return 1.0 * 100 * passing.size() / points.size();
    }
 
    public String gradeDistribution(int minValue, int maxValue) {
        String string = "";
 
        for (int point : this.points) {
            if (point < maxValue && point >= minValue) {
                string += "*";
            }
        }
        return string;
    }
}
 