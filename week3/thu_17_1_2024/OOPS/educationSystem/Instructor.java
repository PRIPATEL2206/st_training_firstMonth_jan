package educationSystem;

// Represents an instructor
class Instructor {
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void gradeAssignment(AssignmentSubmission submission, int grade) {
        submission.setGrade(grade);
    }
}
