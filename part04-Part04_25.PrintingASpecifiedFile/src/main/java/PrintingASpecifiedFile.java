
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(input))) {
            String file = "";
            while (scan.hasNextLine()) {
                file = scan.nextLine();
                System.out.println(file);
            }
        } catch (Exception e) {
            System.out.println("no files");
        }
        
        

    }
}
