
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int numbers = 1;
        int printable = numbers;
        while(printable <= numbers * number) {
            System.out.print("*");
            printable += numbers;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int num = 1;
        int height = size;
        size -=1;
        while (num <= height) {
            printSpaces(size--);
            printStars(num++);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int num = 1;
        int star = 1;
        int tall = height;
        int treeLeg = 0;
        height -=1;
        while (num <= tall) {
            printSpaces(height--);
            printStars(star++);
            star++;
            num++;
        }

        while (treeLeg < 2) {
            printSpaces(tall - 2);
            printStars(3);
            treeLeg++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(1);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
