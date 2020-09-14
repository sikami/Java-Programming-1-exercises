
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] word;
        int age;
        int max = 0;
        String name = "";
        while (!words.isEmpty()) {
            word = words.split(",");
            age = Integer.parseInt(word[1]);
            words = scanner.nextLine();
            if (age > max) {
                max = age;
                name = word[0];

            }
        }

        System.out.println("Name of the oldest: " + name);

    }
}
