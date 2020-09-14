
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        String commands = "";
        String toBeAdded = "";
        
        while (true) {
            System.out.println("Commands: " +
                    "\n1 - add a joke" +
                    "\n2 - draw a joke" +
                    "\n3 - list jokes" +
                    "\nX - stop");
                    
            commands = scanner.nextLine();
            
            if (commands.equals("X")) {
                break;
            } else if (commands.equals("1")) {
                System.out.println("Write the joke to be added:");
                toBeAdded = scanner.nextLine();
                jokeManager.addJoke(toBeAdded);
            } else if (commands.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (commands.equals("3")) {
                jokeManager.printJokes();
            }
        }
    }
    
    
    
}
