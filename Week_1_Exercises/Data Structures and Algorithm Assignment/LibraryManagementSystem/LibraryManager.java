// LibraryManager.java
import java.util.List;

public class LibraryManager {

    // Linear search for book by title
    public Book searchBookByTitleLinear(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Not found
    }

    // Binary search for book by title
    public Book searchBookByTitleBinary(List<Book> books, String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);

            if (midBook.getTitle().equalsIgnoreCase(title)) {
                return midBook;
            }

            if (midBook.getTitle().compareToIgnoreCase(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null; // Not found
    }
}
