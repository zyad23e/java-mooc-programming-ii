
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")){
                System.out.println("");
                break;
            }
            System.out.println("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
            books.add(new Book(bookName, ageRec));
            System.out.println("");
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books: ");
        books.stream().sorted().forEach(book -> System.out.println(book));
    }

}
