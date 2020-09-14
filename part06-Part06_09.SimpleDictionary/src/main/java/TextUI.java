
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {

        String word = "";
        String translation = "";
        String toBeTranslated = "";
        String meaning = "";

        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.print("Word: ");
                word = scanner.nextLine();
                System.out.print("Translation: ");
                translation = scanner.nextLine();
                dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                toBeTranslated = scanner.nextLine();
                if (dict.translate(toBeTranslated) != null) {
                    meaning = dict.translate(toBeTranslated);
                    System.out.println("Translation: " + meaning );
                } else {
                    System.out.println("Word " + toBeTranslated + " was not found");
                }

            } else {
                System.out.println("Unknown command");

            }



        }



    }



}
