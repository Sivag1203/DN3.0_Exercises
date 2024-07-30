// InventoryTest.java
public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        // Add products
        Product product1 = new Product("1", "Laptop", 10, 799.99);
        Product product2 = new Product("2", "Smartphone", 20, 499.99);
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);

        // Print inventory
        System.out.println("Inventory after adding products:");
        inventoryManager.printInventory();

        // Update a product
        Product updatedProduct = new Product("1", "Gaming Laptop", 5, 1299.99);
        inventoryManager.updateProduct("1", updatedProduct);

        // Print inventory after update
        System.out.println("\nInventory after updating product:");
        inventoryManager.printInventory();

        // Delete a product
        inventoryManager.deleteProduct("2");

        // Print inventory after deletion
        System.out.println("\nInventory after deleting product:");
        inventoryManager.printInventory();
    }
}
