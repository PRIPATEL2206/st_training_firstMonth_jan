package educationSystem;

// Represents a submission of an assignment
class AssignmentSubmission {
    private Assignment assignment;
    private String solution;
    private int grade = -1;

    public AssignmentSubmission(Assignment assignment, String solution) {
        this.assignment = assignment;
        this.solution = solution;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public String getSolution() {
        return solution;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
