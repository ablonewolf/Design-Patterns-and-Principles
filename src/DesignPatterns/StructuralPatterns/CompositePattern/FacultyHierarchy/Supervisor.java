package DesignPatterns.StructuralPatterns.CompositePattern.FacultyHierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Supervisor implements Faculty{
    private String name;
    private String fieldName;
    private List<Faculty> professors;

    public Supervisor(String name, String fieldName) {
        this.name = name;
        this.fieldName = fieldName;
        this.professors = new ArrayList<>();
    }

    @Override
    public void getDetails() {
        System.out.println(this.name + " is the Dean of the " + this.fieldName + " field.");
        this.professors.forEach(faculty -> {
            System.out.print("\t");
            faculty.getDetails();
        });
    }
    public void addProfessor(Faculty... faculty) {
        this.professors.addAll(Arrays.asList(faculty));
    }

    public void removeProfessor(Faculty faculty) {
        this.professors.remove(faculty);
    }
}
