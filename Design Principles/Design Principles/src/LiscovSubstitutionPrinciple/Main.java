package LiscovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        ((Car) vehicle).setSpeed(40);
        ((Car) vehicle).setAC(true);
        ((Car) vehicle).setCapacity(5);
        System.out.println(vehicle);
        vehicle = new Bus();
        ((Bus) vehicle).setSpeed(60);
        ((Bus) vehicle).setCapacity(36);
        ((Bus) vehicle).setHasEmerExit(false);
        System.out.println(vehicle);
    }
}
