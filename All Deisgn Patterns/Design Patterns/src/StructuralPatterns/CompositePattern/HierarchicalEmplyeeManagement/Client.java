package StructuralPatterns.CompositePattern.HierarchicalEmplyeeManagement;



public class Client {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Arka Bhuiyan",100,"Software Engineer");
        Employee employee2 = new Developer("Farhan Zaman",101,"Software Engineer");
        Employee employee3 = new Developer("Nasim Ahmed",102,"Software Architect");
        Manager projectManager1 = new Manager("Tanvir Ahmed",110,"Project Manager",100000);
        projectManager1.addEmployee(employee1,employee2,employee3);

        Employee employee4 = new Developer("Farhan Zaman",103,"Software Engineer");
        Employee employee5 = new Developer("Akif Azwad",104,"Software Engineer");
        Employee employee6 = new Developer("Zahid Hossain",105,"Senior Software Engineer");
        Manager projectManager2 = new Manager("Shaiful Islam",120,"Project Manager",100000);
        projectManager2.addEmployee(employee4,employee5,employee6);

        Manager generalManager = new Manager("ABM Mahbubur Rahman",150,"General Manager",350000);
        generalManager.addEmployee(projectManager1,projectManager2);
        generalManager.showEmployeeDetails();

    }
}
