
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input;
        int result;
        int cubes;
        
        while (true) {
            input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            cubes = Integer.parseInt(input);
            System.out.println(cubes * cubes * cubes);
        }

    }
}
