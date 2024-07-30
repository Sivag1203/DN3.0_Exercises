public class MVCPatternTest {
    public static void main(String[] args) {
        // Fetch student record based on the student's roll no from the database
        Student model = retrieveStudentFromDatabase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // Update model data
        controller.setStudentName("John Doe");
        controller.setStudentGrade("A");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setId("10");
        student.setGrade("B");
        return student;
    }
}
