
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to? ");
        int to = Integer.valueOf(scanner.next());
        System.out.println("Where from? ");
        int from = Integer.valueOf(scanner.next());
        
        if (from < to || from == to) {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        } 
        
    }
}
