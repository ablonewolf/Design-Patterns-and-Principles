package DesignPatterns.StructuralPatterns.FlyweightPattern.CounterStrike;

import java.util.Random;

public class CounterStrike {
    public static void main(String[] args) {
        PlayerFactory factory = new PlayerFactory();
        System.out.println("**** Counter Strike Game ****");
        for(int i =0; i<5; i++) {
            Player counterTerrorist = factory.getPlayer("Counter Terrorist");
            if(counterTerrorist!=null) {
//                extrinsic state
                counterTerrorist.assignWeapon(getWeapon());
                counterTerrorist.mission();
            }
        }
        for(int i =0; i<5; i++) {
            Player Terrorist = factory.getPlayer("Terrorist");
            if(Terrorist!=null) {
//                extrinsic state
                Terrorist.assignWeapon(getWeapon());
                Terrorist.mission();
            }
        }
        System.out.println("Number of total player objects in this game : " + factory.totalPlayers() + ".");
    }
    private static String getWeapon() {
        Random random = new Random();
        int number = random.nextInt(8);
        return switch (number) {
            case 1 -> "Pistol";
            case 2 -> "ShotGun";
            case 3 -> "Sword";
            case 4 -> "Axe";
            case 5 -> "AK-47";
            case 6 -> "Snipper Rifle";
            case 7 -> "Mini Gun";
            default -> "Revolver";
        };
    }
}
