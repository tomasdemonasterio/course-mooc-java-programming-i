/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
import java.util.Scanner;
import java.util.ArrayList;
 
public class UserInterface {
 
    Scanner scanner;
    Grade grade;
 
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.grade = new Grade();
    }
 
    public void start() {
        System.out.println("Enter points, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
 
            if (points == -1) {
                break;
            }
            grade.add(points);
        }
        System.out.println("Point average (all): " + grade.average());
        double passingAverage = grade.passingAverage();
        System.out.println("Point average (passing): " +  ((passingAverage == -1) ? "-" : passingAverage));
        System.out.println("Pass percentage: " + grade.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println("5: " + grade.gradeDistribution(90, 101));
        System.out.println("4: " + grade.gradeDistribution(80, 90));
        System.out.println("3: " + grade.gradeDistribution(70, 80));
        System.out.println("2: " + grade.gradeDistribution(60, 70));
        System.out.println("1: " + grade.gradeDistribution(50, 60));
        System.out.println("0: " + grade.gradeDistribution(0, 50));
    }
}