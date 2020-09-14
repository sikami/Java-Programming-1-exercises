
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        while(!words.isEmpty()) {

            String[] word = words.split(" ");
            for(String x : word) {
                System.out.println(x);
            }
            words = scanner.nextLine();
        }

    }
}
