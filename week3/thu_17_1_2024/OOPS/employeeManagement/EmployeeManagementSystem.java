package employeeManagement;


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employees
        Employee employee1 = new Employee("Alice", 50000);
        Employee employee2 = new Employee("Bob", 45000);

        // Create a manager
        Manager manager1 = new Manager("Charlie", 80000);

        // Create a department and assign a manager
        Department department1 = new Department("Engineering", manager1);

        // Add employees to the department
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);

        // Add a subordinate to the manager
        manager1.addSubordinate(employee1);

        // Calculate and display salaries
        System.out.println("\nCalculated Salaries:");
        System.out.println(employee1.getName() + "'s Salary: $" + employee1.calculateSalary());
        System.out.println(employee2.getName() + "'s Salary: $" + employee2.calculateSalary());
        System.out.println(manager1.getName() + "'s Salary: $" + manager1.calculateSalary());

        // Promote an employee in the department
        department1.promoteEmployee(employee1);
    }
}

