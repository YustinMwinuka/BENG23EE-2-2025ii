
    // Subclass inheriting from Student
    public class UndergraduateStudent extends Student {

        int yearLevel;

        // Constructor for UndergraduateStudent
        public UndergraduateStudent(String studentId, String name, int yearLevel) {

            super(studentId, name);
            System.out.println("UndergraduateStudent constructor called.");

            // Initialize the subclass specific attribute
            this.yearLevel = yearLevel;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Type: Undergraduate");
            System.out.println("Year: " + yearLevel);
            System.out.println("---------------");
        }

        public void printYearLevel() {
            System.out.println(name + " is in year " + yearLevel);
        }
    }

