
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try(Scanner scan = new Scanner(Paths.get(file))) {
            String names = "";

            boolean found = false;
            while(scan.hasNextLine()) {
                names = scan.nextLine();
                if (names.compareTo(searchedFor) == 0) {
                    found = true;
                    break;
                }
            }

            if (found == true) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
