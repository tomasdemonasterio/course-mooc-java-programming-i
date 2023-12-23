import java.util.ArrayList;
import sun.tools.tree.ThisExpression;
 
public class GradeRegister {
 
    private ArrayList<Integer> grades;
    private int sumPoints;
    private int countPoints;
 
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.sumPoints = 0;
        this.countPoints = 0;
    }
 
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.sumPoints += points;
        this.countPoints++;
    }
 
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
 
        return count;
    }
 
    public static int pointsToGrade(int points) {
 
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
 
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        return 1.0 * this.sumGrades() / this.grades.size();
    }
 
    public int sumGrades() {
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum;
    }
 
    public double averageOfPoints() {
        if (this.sumPoints == 0) {
            return -1;
        }
        return 1.0 * this.sumPoints / this.countPoints;
    }
    
}