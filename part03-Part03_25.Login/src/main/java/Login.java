
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String userOne = "alex";
        final String userTwo = "emma";
        final String passOne = "sunshine";
        final String passTwo = "haskell";
        
        System.out.println("Enter username: ");
        String userInput = scanner.nextLine();
        System.out.println("Enter password: ");
        String passInput = scanner.nextLine();
        
        if(userInput.equals(userOne) && passInput.equals(passOne) || 
                userInput.equals(userTwo) && passInput.equals(passTwo))  {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
