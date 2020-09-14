
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //prompts user for filename
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            String read = "";
            String[] fullRead;
            int count = 0;
            int lose = 0;
            int win = 0;
            int homeTeam;
            int opponent;

            while(scanner.hasNextLine()) {
                read = scanner.nextLine();
                fullRead = read.split(",");
                homeTeam = Integer.valueOf(fullRead[2]);
                opponent = Integer.valueOf(fullRead[3]);
                if (read.contains(team)) {
                    count++;
                } 
                
                if (fullRead[0].compareTo(team) == 0) {
                    if (homeTeam < opponent) {
                        lose++;
                    } else {
                        win++;
                    }
                    //else if the team is not playing at home, they are the opponent
                } else if (fullRead[1].compareTo(team) == 0) {
                    if (homeTeam < opponent) {
                        win++;
                    } else {
                        lose++;
                    }
                }
            }
            
            System.out.println("Games: " + count);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);
        } catch (Exception e) {
            
        }

    }

}
