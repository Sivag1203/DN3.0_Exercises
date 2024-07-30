public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Adding employees
        manager.addEmployee(new Employee("E001", "Alice", "Developer", 70000));
        manager.addEmployee(new Employee("E002", "Bob", "Manager", 80000));
        manager.addEmployee(new Employee("E003", "Charlie", "Analyst", 60000));

        // Traversing employees
        System.out.println("All Employees:");
        manager.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearching for employee with ID E002:");
        Employee employee = manager.searchEmployeeById("E002");
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        System.out.println("\nDeleting employee with ID E001:");
        if (manager.deleteEmployeeById("E001")) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traversing employees after deletion
        System.out.println("\nAll Employees after deletion:");
        manager.traverseEmployees();
    }
}
