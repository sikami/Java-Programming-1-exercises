
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        String[] word;
        double birthYear;
        double averageBirthYear;
        double sum = 0;
        double count = 0;
        String name = "";
        int longestName = 0;
        while (!words.isEmpty()) {
            word = words.split(",");
            birthYear = Double.parseDouble(word[1]);
            //sum
            sum += birthYear;
            count++;

            if (word[0].length() > longestName) {
                longestName = word[0].length();
                name = word[0];

            }
            words = scanner.nextLine();
        }

        averageBirthYear = sum / count;
        System.out.println("Longest name: " + name );
        System.out.println("Average of the birth years: " + averageBirthYear);
        
    }
}
