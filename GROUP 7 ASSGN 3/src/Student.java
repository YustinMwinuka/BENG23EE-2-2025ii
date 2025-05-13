
    // Base class (Superclass)
    public class Student {
        String studentId;
        String name;

        // Constructor for Student
        public Student(String studentId, String name) {
            System.out.println("Student constructor called for ID: " + studentId);
            this.studentId = studentId;
            this.name = name;
        }

        // Method to display basic student details
        public void display() {
            System.out.println("--- Details ---");
            System.out.println("ID: " + studentId);
            System.out.println("Name: " +name);
        }
    }

