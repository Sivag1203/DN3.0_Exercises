import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O1", "Alice", 150.00),
                new Order("O2", "Bob", 200.00),
                new Order("O3", "Charlie", 100.00),
                new Order("O4", "Diana", 250.00)
        };

        // Bubble Sort Test
        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Quick Sort Test
        Order[] quickSortedOrders = orders.clone();
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
