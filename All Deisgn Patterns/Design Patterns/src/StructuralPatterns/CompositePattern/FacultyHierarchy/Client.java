package StructuralPatterns.CompositePattern.FacultyHierarchy;

public class Client {
    public static void main(String[] args) {
        Professor cseProfessor1 = new Professor("Mobin Ul Haque","Lecturer",1234567);
        Professor cseProfessor2 = new Professor("Shiplu Howladar","Senior Lecture",9876543);
        Professor cseProfessor3 = new Professor("Rezaul Karin","Professor",7654321);

        Supervisor cseChair = new Supervisor("Upoma Kabir","CSE");
        cseChair.addProfessor(cseProfessor1,cseProfessor2,cseProfessor3);
        Professor mathProfessor1 = new Professor("Abu Ahmad Ferdous","Associate Professor",4567899);
        Professor mathProfessor2 = new Professor("Mohammad Rana","Lecturer",2345678);
        Supervisor mathChair = new Supervisor("Amin Hossain Khan","Math");
        mathChair.addProfessor(mathProfessor1,mathProfessor2);

        Supervisor techSupervisor = new Supervisor("Mohammad Hassanuzzamn","Techology");
        techSupervisor.addProfessor(cseChair,mathChair);
        System.out.println("The Faculty of Technology has the following structure");
        techSupervisor.getDetails();
    }
}
