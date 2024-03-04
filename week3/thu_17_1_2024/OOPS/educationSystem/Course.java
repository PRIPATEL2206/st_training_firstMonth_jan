package educationSystem;

import java.util.ArrayList;
import java.util.List;

// Represents a course
class Course {
    private String name;
    private List<Student> enrolledStudents;
    private List<Assignment> assignments;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
