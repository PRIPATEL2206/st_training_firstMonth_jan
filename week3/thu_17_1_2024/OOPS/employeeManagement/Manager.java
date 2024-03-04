package employeeManagement;

import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
    private List<Employee> subordinates;

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
        this.subordinates = new ArrayList<>();
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
        System.out.println(subordinate.getName() + " added as a subordinate to Manager " + getName());
    }

    public void removeSubordinate(Employee subordinate) {
        subordinates.remove(subordinate);
        System.out.println(subordinate.getName() + " removed as a subordinate from Manager " + getName());
    }

    @Override
    public double calculateSalary() {
        // Manager's salary is the sum of their base salary and bonuses for each subordinate
        double totalSalary = getBaseSalary();
        for (Employee subordinate : subordinates) {
            totalSalary += subordinate.calculateSalary() * 0.1; // 10% bonus for each subordinate
        }
        return totalSalary;
    }
}
