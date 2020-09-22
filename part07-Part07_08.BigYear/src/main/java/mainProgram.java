
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        start();

    }
    
     public static void start() {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        String input = "";
        String latin = "";
        while(true) {
            System.out.print("? ");
            input = scanner.nextLine();

            if (input.equals("Quit")) {
                break;
            }

            switch (input) {
                case "Add":
                    System.out.print("Name: ");
                    input = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    latin = scanner.nextLine();
                    database.addBirds( new Birds(input, latin));
                    break;
                case "Observation" :
                    System.out.print("Bird? ");
                    input = scanner.nextLine();
                    if (database.findBird(input)) {
                        database.observe(input);
                    } else {
                        System.out.println("Not a bird!");
                    }
                    break;
                case "All" :
                    database.printAllBirds();
                    break;
                case "One" :
                    System.out.print("Bird? ");
                    input = scanner.nextLine();
                    database.printOneBird(input);
                    break;
            }
            
        }
    }

}
