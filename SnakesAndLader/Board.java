package SnakesAndLader;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Board {
    public Map<Player, PlayerCoordinate> mp;
    public List<Snake> snakes;
    public List<Ladder> ladders;
    public int size;

    public Board(int size, List<Snake> snakes, List<Ladder> ladders) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
        this.mp = new HashMap<>();
    }

    public PlayerCoordinate getPlayerCoordinate(Player player) {
        return mp.get(player);
    }
}
