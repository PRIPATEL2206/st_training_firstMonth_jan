package taskManagement;

import java.util.ArrayList;
import java.util.List;

class TeamMember {
    private String name;
    private List<Task> assignedTasks;

    public TeamMember(String name) {
        this.name = name;
        this.assignedTasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAssignedTask(Task task) {
        assignedTasks.add(task);
    }

    public List<Task> getAssignedTasks() {
        return assignedTasks;
    }

    public void displayWorkload() {
        System.out.println("Workload for " + name + ":");
        for (Task task : assignedTasks) {
            System.out.println("- " + task.getName() + ": " +
                    (task.isCompleted() ? "Completed" : "Not Completed"));
        }
    }
}
