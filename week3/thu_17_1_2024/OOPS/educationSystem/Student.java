package educationSystem;

import java.util.ArrayList;
import java.util.List;

// Represents a student
class Student {
    private String name;
    private List<Course> enrolledCourses;
    private List<AssignmentSubmission> assignmentSubmissions;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.assignmentSubmissions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public void submitAssignment(Assignment assignment, String solution) {
        AssignmentSubmission submission = new AssignmentSubmission(assignment, solution);
        assignmentSubmissions.add(submission);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public List<AssignmentSubmission> getAssignmentSubmissions() {
        return assignmentSubmissions;
    }
}
