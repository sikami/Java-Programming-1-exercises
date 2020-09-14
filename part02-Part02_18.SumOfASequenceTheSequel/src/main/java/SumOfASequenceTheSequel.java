
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.next());
        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.next());
        
        int sum = 0;
        int count = first;
        
        for (int i = first; i <= last; i++) {
            sum += count;
            count++;
        }
        System.out.println("The sum is: " + sum);
    }
}
