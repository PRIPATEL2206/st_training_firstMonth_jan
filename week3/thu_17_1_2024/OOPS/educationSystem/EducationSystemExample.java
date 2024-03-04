package educationSystem;

import java.util.ArrayList;
import java.util.List;

public class EducationSystemExample {
    public static void main(String[] args) {
        // Create courses
        Course mathCourse = new Course("Mathematics");
        Course javaCourse = new Course("Java Programming");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create instructor
        Instructor instructor = new Instructor("Dr. Smith");

        // Enroll students in courses
        student1.enrollInCourse(mathCourse);
        student2.enrollInCourse(javaCourse);

        // Add assignments to courses
        Assignment mathAssignment = new Assignment("Math Assignment 1");
        Assignment javaAssignment = new Assignment("Java Assignment 1");

        mathCourse.addAssignment(mathAssignment);
        javaCourse.addAssignment(javaAssignment);

        // Students submit assignments
        student1.submitAssignment(mathAssignment, "Math solution from Alice");
        student2.submitAssignment(javaAssignment, "Java solution from Bob");

        // Instructor grades assignments
        instructor.gradeAssignment(student1.getAssignmentSubmissions().get(0), 90);
        instructor.gradeAssignment(student2.getAssignmentSubmissions().get(0), 85);

        // Display student progress
        displayStudentProgress(student1);
        displayStudentProgress(student2);
    }

    private static void displayStudentProgress(Student student) {
        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getEnrolledCourses().size());
        System.out.println("Assignment Submissions: " + student.getAssignmentSubmissions().size());

        for (AssignmentSubmission submission : student.getAssignmentSubmissions()) {
            System.out.println("Assignment: " + submission.getAssignment().getName());
            System.out.println("Solution: " + submission.getSolution());
            System.out.println("Grade: " + (submission.getGrade() == -1 ? "Not graded" : submission.getGrade()));
            System.out.println();
        }
        System.out.println("---------------");
    }
}

