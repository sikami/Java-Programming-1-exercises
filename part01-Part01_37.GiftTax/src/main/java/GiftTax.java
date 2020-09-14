
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scanner.nextLine());

        final double taxLvlOne = 100;
        final double taxLvlTwo = 1700;
        final double taxLvlThree = 4700;
        final double taxLvlFour = 22_100;
        final double taxLvlFive = 142_100;
        final double minValueLvlOne = 5_000;
        final double minValueLvlTwo = 25_000;
        final double minValueLvlThree = 55_000;
        final double minValueLvlFour = 200_000;
        final double minValueLvlFive = 1000_000;
        final double taxOne = 0.08;
        final double taxTwo = 0.10;
        final double taxThree = 0.12;
        final double taxFour = 0.15;
        final double taxFive = 0.17;

        double tax = 0;

        if (value >= minValueLvlOne && value <= minValueLvlTwo) {
            tax = (taxLvlOne + (value - minValueLvlOne) * taxOne);
        } else if (value > minValueLvlTwo && value <= minValueLvlThree) {
            tax =  (taxLvlTwo + (value - minValueLvlTwo) * taxTwo);
        } else if (value > minValueLvlThree && value <= minValueLvlFour) {
            tax = (taxLvlThree + (value - minValueLvlThree) * taxThree);
        } else if (value > minValueLvlFour && value <= minValueLvlFive) {
            tax = (taxLvlFour + (value - minValueLvlFour) * taxFour);
        } else if (value > minValueLvlFive) {
            tax = (taxLvlFive + (value - minValueLvlFive) * taxFive);
        }

        if (tax > 0) {
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }

    }
}
