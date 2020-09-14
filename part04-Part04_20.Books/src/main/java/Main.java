import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        String title;
        String year;
        int pages;
        
        while (true) {
            title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            pages = Integer.valueOf(scanner.nextLine());
            year = scanner.nextLine();
            books.add(new Book(title, pages, year));         
            
        }
        
        String decision = scanner.nextLine();
        for (Book book : books) {
            if(decision.equals("everything")) {
                System.out.println(book);
            } else if (decision.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
