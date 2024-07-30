public class TaskManagementTest {
    public static void main(String[] args) {
        SinglyLinkedList taskManager = new SinglyLinkedList();

        // Adding tasks
        taskManager.addTask(new Task("T001", "Design Database", "In Progress"));
        taskManager.addTask(new Task("T002", "Develop API", "Not Started"));
        taskManager.addTask(new Task("T003", "Testing", "Completed"));

        // Traversing tasks
        System.out.println("All Tasks:");
        taskManager.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for task with ID T002:");
        Task task = taskManager.searchTaskById("T002");
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting task with ID T001:");
        if (taskManager.deleteTaskById("T001")) {
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }

        // Traversing tasks after deletion
        System.out.println("\nAll Tasks after deletion:");
        taskManager.traverseTasks();
    }
}
