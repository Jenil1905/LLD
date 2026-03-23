package SnakesAndLader;

import java.util.List;

public abstract class DefaultMode implements GameMode {
    @Override
    public boolean hasWon(PlayerCoordinate pc, Board b) {
        return pc.x >= b.size;
    }

    @Override
    public boolean hasEnded(Board b) {
        return false;
    }

    @Override
    public List<Snake> getSnakes(int bSize) {
        return null;
    }

    @Override
    public List<Ladder> getLadders(int bSize) {
        return null;
    }
}
