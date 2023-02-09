package model.manager;

public class RandomCarMoveManager implements CarMoveManager {
    private static final int BOUNDARY_VALUE = 4;

    @Override
    public boolean isMove(int number) {
        return number >= BOUNDARY_VALUE;
    }
}