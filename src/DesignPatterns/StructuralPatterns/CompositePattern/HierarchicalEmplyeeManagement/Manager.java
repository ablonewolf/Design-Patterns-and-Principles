package DesignPatterns.StructuralPatterns.CompositePattern.HierarchicalEmplyeeManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private long employeeID;
    private String position;
    private int salary;
    private List<Employee> employeeList;

    public Manager(String name, long employeeID, String position, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.position = position;
        this.salary = salary;
        this.employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("******************");
        System.out.println(this.getName());
        System.out.println(this.getEmployeeID());
        System.out.println(this.getPosition());
        System.out.println(this.getSalary());
        System.out.println("******************");
        this.employeeList.forEach(Employee::showEmployeeDetails);
    }
    public void addEmployee(Employee... employee) {
        this.employeeList.addAll(Arrays.asList(employee));
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
