package pacman;

public class PacManNavigatorImpl_Skeleton implements PacManNavigator {
    private String board;
    private Direction[] tracker;
    private int points = 0;

    public PacManNavigatorImpl_Skeleton(String board, int maxTurns) {
        this.board = board;
        tracker = new Direction[maxTurns];
    }

    @Override
    public void move(Direction direction, int distance) {

    }

    @Override
    public int getPelletsEaten() {
        int count = 0;
        int pelletsLeft = 0;
        for (int i = 0; i < board.length(); i++) {
            char ch_i = board.charAt(i);
            if (ch_i == '*') {
                pelletsLeft += 1;
            }
        }
        return points;
    }

    @Override
    public int getPoints() {
        return points;
    }

    public String toString() {
        return board;
    }
}
