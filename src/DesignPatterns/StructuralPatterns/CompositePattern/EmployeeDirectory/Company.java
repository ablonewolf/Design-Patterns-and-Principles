package DesignPatterns.StructuralPatterns.CompositePattern.EmployeeDirectory;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Arka Bhuiyan",100,"Software Engineer");
        Employee employee2 = new Developer("Farhan Zaman",101,"Software Engineer");
        Employee employee3 = new Developer("Nasim Ahmed",102,"Software Architect");
        Employee manager = new Manager("Tanvir Ahmed",105,"Project Manager");
        Employee manager1 = new Manager("ABM Bashar",110,"General Manager");
//        The directory to maange only the engineers and architects
        System.out.println("Al Engineers.");
        EmployeeDirectory engineerDirectory = new EmployeeDirectory();
        engineerDirectory.addEmployee(employee1,employee2,employee3);
        engineerDirectory.showEmployeeDetails();
//        The management directory
        System.out.println("The Full managemet");
        EmployeeDirectory managementDirectory = new EmployeeDirectory();
        managementDirectory.addEmployee(manager,manager1);
        managementDirectory.showEmployeeDetails();
//        The full company directory for managing all the employees
        System.out.println("The full company");
        EmployeeDirectory companyDirectory = new EmployeeDirectory();
        companyDirectory.addEmployee(managementDirectory,engineerDirectory);
        companyDirectory.showEmployeeDetails();


    }
}
