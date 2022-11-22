package StructuralPatterns.CompositePattern.FacultyHierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chair implements Faculty{
    private String name;
    private String departmentName;
    private List<Faculty> professors;

    public Chair(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.professors = new ArrayList<>();
    }

    @Override
    public void getDetails() {
        System.out.println(this.name + " is the Chair of the " + this.departmentName + " department.");
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
