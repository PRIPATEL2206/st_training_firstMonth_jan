package taskManagement;

import java.util.ArrayList;
import java.util.List;

public class ProjectManagementSystem {
    public static void main(String[] args) {
        // Create a project
        Project project = new Project("Software Development Project");

        // Create tasks
        Task task1 = new Task("Design Database", "Design the database schema for the project");
        Task task2 = new Task("Implement Backend", "Implement the backend logic of the system");
        Task task3 = new Task("Create UI", "Develop the user interface for the application");

        // Add tasks to the project
        project.addTask(task1);
        project.addTask(task2);
        project.addTask(task3);

        // Create team members
        TeamMember member1 = new TeamMember("Alice");
        TeamMember member2 = new TeamMember("Bob");

        // Add team members to the project
        project.addTeamMember(member1);
        project.addTeamMember(member2);

        // Assign tasks to team members
        project.assignTaskToMember(task1, member1);
        project.assignTaskToMember(task2, member2);
        project.assignTaskToMember(task3, member1);

        // Display assigned tasks for team members
        for (TeamMember member : project.getTeamMembers()) {
            member.displayWorkload();
        }

        // Complete tasks
        project.completeTask(task1);
        project.completeTask(task2);

        // Display updated workload for team members
        for (TeamMember member : project.getTeamMembers()) {
            member.displayWorkload();
        }
    }
}
