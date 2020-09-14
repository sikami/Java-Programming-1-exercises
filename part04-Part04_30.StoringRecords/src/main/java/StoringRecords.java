
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            String read = "";
            String[] fullRead;
            String name;
            int age;
            while(scanner.hasNextLine()) {
                read = scanner.nextLine();
                fullRead = read.split(",");
                name = fullRead[0];
                age = Integer.valueOf(fullRead[1]);
                persons.add(new Person(name, age));
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
        
        // and printing the read records
        return persons;

    }
}
