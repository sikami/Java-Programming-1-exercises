
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        
        if (num < 0) {
            System.out.println("Grade: imposibble!");
        } else if (num >= 0 && num < 50) {
            System.out.println("Grade: failed");
        } else if (num > 49 && num < 60) {
            System.out.println("Grade: 1");
        } else if (num > 59 && num < 70) {
            System.out.println("Grade: 2");
        } else if (num > 69 && num < 80) {
            System.out.println("Grade: 3");
        } else if (num > 79 && num < 90) {
            System.out.println("Grade: 4");
        } else if (num > 89 && num < 101) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }

    }
}
