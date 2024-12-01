class Student {
    private int studentId;
    private String name;
    private int age;
    private String course;

    public Student(int studentId, String name, int age, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void updateCourse(String newCourse) {
        this.course = newCourse;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Course: " + this.course);
    }
}

public class Tester {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice", 20, "Computer Science");
        student.updateCourse("Information Technology");
        student.displayStudentInfo();
    }
}
