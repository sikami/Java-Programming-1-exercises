
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int num = Integer.valueOf(scanner.next());
        int count = num;
        int sum = 0;
        while (count > 0) {
            sum+=count;
            count--;
        }
        System.out.println("The sum is " + sum);

    }
}
