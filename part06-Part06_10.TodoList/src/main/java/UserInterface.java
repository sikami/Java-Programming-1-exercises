
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
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    
    public void start() {
        String command = "";
        String toAdd = "";
        int remove;
        
        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                toAdd = scanner.nextLine();
                toDoList.add(toAdd);
            } else if (command.equals("list")) {
                toDoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                remove = Integer.valueOf(scanner.nextLine());
                toDoList.remove(remove);
            }
            
        }
    }
    
    
}
