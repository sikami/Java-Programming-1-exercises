
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        
        int input = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> listOfNums = new ArrayList<>();
        
        while(true) {
            if (input == -1) {
                break;
            }
            listOfNums.add(input);
            input = Integer.valueOf(scanner.nextLine());
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int sum = 0;
        for (int number : listOfNums) {
            sum += number;
        }
        
        double average = (double) sum / (double) listOfNums.size();
        System.out.println("Average: " + average);
        
    }
}
