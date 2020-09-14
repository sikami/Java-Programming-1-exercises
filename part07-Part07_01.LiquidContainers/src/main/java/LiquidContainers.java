
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        final int liquidLimit = 100;
        String[] inputs;
        String command;
        int numberToAdd;

        while (true) {
            System.out.println("First: " + first + "/" + liquidLimit);
            System.out.println("Second: " + second + "/" + liquidLimit);

            String input = scan.nextLine();
            inputs = input.split(" ");


            if (input.equals("quit")) {
                break;
            }

            command = inputs[0];
            numberToAdd = Integer.parseInt(inputs[1]);

            if (command.equals("add")) {
                if (numberToAdd < 0) {

                } else if (first + numberToAdd <= 100) {
                    first += numberToAdd;
                } else {
                    first = 100;
                }
            } else if (command.equals("move")) {
                if (numberToAdd < 0 || first == 0) {

                } else if (first < numberToAdd) {
                    second += first;
                    first = 0;
                } else if (second + numberToAdd <= 100) {
                    second += numberToAdd;
                    first -= numberToAdd;
                } else {
                    numberToAdd = (numberToAdd - first) + numberToAdd;
                    second = 100;
                    first = numberToAdd;
                }
            } else if (command.equals("remove")) {
                if (numberToAdd < 0) {

                } else if (numberToAdd > second) {
                    second = 0;
                } else {
                    second -= numberToAdd;
                }
            }

        }
    }

}
