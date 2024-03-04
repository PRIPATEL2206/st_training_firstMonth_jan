package employeeManagement;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private Manager departmentManager;
    private List<Employee> employees;

    public Department(String name, Manager departmentManager) {
        this.name = name;
        this.departmentManager = departmentManager;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Manager getDepartmentManager() {
        return departmentManager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " added to Department " + name);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        System.out.println(employee.getName() + " removed from Department " + name);
    }

    public void promoteEmployee(Employee employee) {
        employee.promote();
    }
}
