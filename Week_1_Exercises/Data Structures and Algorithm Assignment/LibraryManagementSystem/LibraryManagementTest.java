import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryManagementTest {
    public static void main(String[] args) {
        // Sample books
        List<Book> books = new ArrayList<>();
        books.add(new Book("B001", "Java Programming", "Alice Smith"));
        books.add(new Book("B002", "Data Structures", "Bob Johnson"));
        books.add(new Book("B003", "Algorithms", "Charlie Brown"));

        // Sort books by title for binary search
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        LibraryManager manager = new LibraryManager();

        // Linear search example
        System.out.println("Linear Search:");
        Book book = manager.searchBookByTitleLinear(books, "Data Structures");
        System.out.println(book != null ? book : "Book not found.");

        // Binary search example
        System.out.println("\nBinary Search:");
        book = manager.searchBookByTitleBinary(books, "Data Structures");
        System.out.println(book != null ? book : "Book not found.");
    }
}
