
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        String[] word;
        while (!words.isEmpty()) {
            word = words.split(" ");
            for(String wrd : word) {
                if(wrd.contains("av")) {
                    System.out.println(wrd);
                }
            }
            words = scanner.nextLine();
        }
    }
}
