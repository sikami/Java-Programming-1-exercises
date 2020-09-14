
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word;
        int count = 0;
        
        while (true) {
            word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            
            count++;
        }

        System.out.println(count);
    }
}
