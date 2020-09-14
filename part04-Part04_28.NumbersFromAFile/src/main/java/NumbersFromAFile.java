
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            int integer;
            int count = 0;
            while (scan.hasNextLine()) {
                integer = Integer.valueOf(scan.nextLine());
                
                if (integer >= lowerBound && integer <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
            
        } catch (Exception e) {
            
        }

    }

}
