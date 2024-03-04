package taskManagement;

import java.util.ArrayList;
import java.util.List;

class Project {
    private String name;
    private List<Task> tasks;
    private List<TeamMember> teamMembers;

    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
        this.teamMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void assignTaskToMember(Task task, TeamMember teamMember) {
        if (tasks.contains(task) && teamMembers.contains(teamMember)) {
            teamMember.addAssignedTask(task);
            System.out.println("Task '" + task.getName() + "' assigned to " + teamMember.getName());
        } else {
            System.out.println("Assignment failed. Please check task and team member details.");
        }
    }

    public void completeTask(Task task) {
        if (tasks.contains(task)) {
            task.completeTask();
            System.out.println("Task '" + task.getName() + "' marked as completed.");
        } else {
            System.out.println("Completion failed. Task not found in the project.");
        }
    }

    public void addTeamMember(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }

    public List<TeamMember> getTeamMembers() {
        return teamMembers;
    }
}
