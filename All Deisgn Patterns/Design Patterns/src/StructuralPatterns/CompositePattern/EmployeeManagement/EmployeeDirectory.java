package StructuralPatterns.CompositePattern.EmployeeManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDirectory implements Employee{
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails() {
        employees.forEach(employee -> {
            employee.showEmployeeDetails();
        });
    }

    public void addEmployee(Employee... employee) {
        this.employees.addAll(Arrays.asList(employee));
    }

    public void removeEmployee(Employee employee) {
        if(this.employees.contains(employee)) {
            this.employees.remove(employee);
        }
        else {
            System.out.println("This object does not exist");
        }
    }

}
