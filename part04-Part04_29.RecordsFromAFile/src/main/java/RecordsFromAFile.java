
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //prompts user for the name of the file
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        //read the file
        try (Scanner scan = new Scanner(Paths.get(file))) {
            String reader = "";
            
            //variable to store the name and age
            String name;
            String[] input;
            int age;
            while (scan.hasNextLine()) {
                reader = scan.nextLine();
                input = reader.split(",");
                name = input[0];
                age = Integer.valueOf(input[1]);
                
                if (age == 1) {
                    System.out.println("Name: " + name + ", age: " + age + " year");
                } else {
                System.out.println("Name: " + name + ", age: " + age + " years");
                }
              
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
        
        //print content name, age: number year
        //if age >1 year = years
            //else year

    }
}
