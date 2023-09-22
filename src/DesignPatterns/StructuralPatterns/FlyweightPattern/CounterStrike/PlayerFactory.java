package DesignPatterns.StructuralPatterns.FlyweightPattern.CounterStrike;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private Map<String,Player> players;

    public PlayerFactory() {
        this.players = new HashMap<>();
    }
    public int totalPlayers() {
        return this.players.size();
    }
    public Player getPlayer(String playerType) {
        Player player = null;
        if(this.players.containsKey(playerType.toLowerCase())) {
            player = players.get(playerType.toLowerCase());
        }
        else {
            switch (playerType.toLowerCase()) {
                case "terrorist" -> {
                    System.out.println("We are creating an instance for Terrorist.");
                    Player player1 = new Terrorist();
                    players.put("terrorist",player1);
                    break;
                }
                case "counter terrorist" -> {
                    System.out.println("We are creating an instance for Counter Terrorist.");
                    Player player1 = new CounterTerrorist();
                    players.put("counter terrorist",player1);
                    break;
                }
                default -> {
                    System.out.println("There is only two types of player available : Terrorist and Counter Terrorist.");
                }
            }
        }
        return player;
    }
}
