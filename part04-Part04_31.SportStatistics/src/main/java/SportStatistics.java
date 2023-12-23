 
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesCount = 0;
        int winsCount = 0;
        int lossesCount = 0;
 
        try ( Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String[] pieces = file.nextLine().split(",");
                String homeTeam = pieces[0];
                String visitingTeam = pieces[1];
                int homeTeamPoints = Integer.valueOf(pieces[2]);
                int visitingTeamPoints = Integer.valueOf(pieces[3]);
                Boolean isHomeTeam = homeTeam.equals(team);
                boolean isVisitingTeam = visitingTeam.equals(team);
                boolean isTeamPlaying = isHomeTeam || isVisitingTeam;
 
                if (isTeamPlaying) {
                    gamesCount++;
                    Boolean isTeamWinner = (isHomeTeam && homeTeamPoints > visitingTeamPoints) || (isVisitingTeam && visitingTeamPoints > homeTeamPoints);
                    if (isTeamWinner) {
                        winsCount++;
                    } else {
                        lossesCount++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + winsCount);
        System.out.println("Losses: " + lossesCount);
    }
 
}
 