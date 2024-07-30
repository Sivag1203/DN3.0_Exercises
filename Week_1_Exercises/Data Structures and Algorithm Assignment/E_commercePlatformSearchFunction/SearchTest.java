import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        // Create product array
        Product[] products = {
                new Product("3", "Product3", "Category1"),
                new Product("1", "Product1", "Category2"),
                new Product("2", "Product2", "Category3")
        };

        // Sort products by productId for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        // Linear Search Test
        Product resultLinear = LinearSearch.linearSearch(products, "2");
        System.out.println("Linear Search Result: " + resultLinear);

        // Binary Search Test
        Product resultBinary = BinarySearch.binarySearch(products, "2");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
