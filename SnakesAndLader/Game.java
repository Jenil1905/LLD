package SnakesAndLader;

import java.util.Queue;
import java.util.LinkedList;

public class Game {
    public Queue<Player> players;
    public int numPlayer;
    public Board b;
    public GameMode gameMode;

    public Game(int numPlayer, Board b, GameMode gameMode) {
        this.numPlayer = numPlayer;
        this.b = b;
        this.gameMode = gameMode;
        this.players = new LinkedList<>();
    }

    public void start() {
    }

    public void makeTurn() {
    }
}
