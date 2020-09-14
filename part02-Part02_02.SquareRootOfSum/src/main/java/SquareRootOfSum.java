
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numOne = Integer.valueOf(scanner.nextLine());
        double numTwo = Integer.valueOf(scanner.nextLine());
        double result = Math.sqrt(numOne + numTwo);

        System.out.println((int)result);
    }
}
