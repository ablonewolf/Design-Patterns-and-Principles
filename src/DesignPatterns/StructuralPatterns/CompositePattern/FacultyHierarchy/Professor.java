package DesignPatterns.StructuralPatterns.CompositePattern.FacultyHierarchy;

public class Professor implements Faculty{
    private String name;
    private String position;
    private long officeNumber;

    public Professor(String name, String position, long officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public void getDetails() {
        System.out.println("\t" + "Professor Details : Name : " + this.name + ", Position: " + this.position + " , contact number : " + officeNumber);
    }
}
