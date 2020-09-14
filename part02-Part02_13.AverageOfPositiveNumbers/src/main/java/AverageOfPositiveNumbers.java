
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;
        

        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            if(num == 0 ) {
                System.out.println("Cannot calculate the average");
                break;
            } else {
                if (num > 0) {
                    sum += num;
                    count++;
                } 
                
                continue;
            }
        }
        double average = (double) sum / (double) count;
        System.out.println("Average of the numbers: " + average);
    }
}
