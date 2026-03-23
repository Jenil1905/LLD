package SnakesAndLader;

import java.util.List;

public interface GameMode {
    void makeTurn(Board b, PlayerCoordinate pc);

    List<Snake> getSnakes(int bSize);

    List<Ladder> getLadders(int bSize);

    boolean hasWon(PlayerCoordinate pc, Board b);

    boolean hasEnded(Board b);
}
