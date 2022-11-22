package StructuralPatterns.CompositePattern.HierarchicalEmplyeeManagement;


public class Developer implements Employee {

    private String name;
    private long employeeId;
    private String position;

    public Developer(String name, long employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.getEmployeeId() + " " + this.getName() + " " + this.getPosition());
    }

    public String getName() {
        return name;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }
}
