
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int secondsInADay = 86400;
        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int day = Integer.valueOf(scanner.nextLine());
        int result = day * secondsInADay;
        System.out.println(result);

    }
}
