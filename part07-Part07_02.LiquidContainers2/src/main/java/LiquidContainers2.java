    
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int liquidLimit = 100;
        String[] inputs;
        String command;
        int numberToAdd;

        Container container1 = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: " + container1.contains() + "/" + liquidLimit);
            System.out.println("Second: " + container2.contains() + "/" + liquidLimit);

            String input = scan.nextLine();
            inputs = input.split(" ");


            if (input.equals("quit")) {
                break;
            }

            command = inputs[0];
            numberToAdd = Integer.parseInt(inputs[1]);

            if (command.equals("add")) {
                container1.add(numberToAdd);
            } else if (command.equals("move")) {
                if (numberToAdd < 0 || container1.contains() == 0) {

                } else if (container1.contains() < numberToAdd) {
                    container2.add(container1.contains());
                        container1.remove(liquidLimit);
                } else if (container2.contains() + numberToAdd <= liquidLimit) {
                    container2.add(numberToAdd);
                    container1.remove(numberToAdd);
                } else {
                    numberToAdd = (numberToAdd - container1.contains()) + numberToAdd;
                    container2.add(liquidLimit);
                    container1.add(numberToAdd);
                }
                
            } else if (command.equals("remove")) {
                container2.remove(numberToAdd);
            }

        }
    }
}
