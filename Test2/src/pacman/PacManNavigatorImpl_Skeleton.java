package pacman;

public class PacManNavigatorImpl_Skeleton extends PacManMaze implements PacManNavigator {
    public static final char NAVIGATOR = 'O';
    private Direction[] tracker;
    private int pellets;

    public PacManNavigatorImpl_Skeleton(String board, int maxTurns) {
        super(board);
        tracker = new Direction[maxTurns];
        pellets = 0;
    }

    @Override
    public void move(Direction direction) {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    @Override
    public int movesLeft() {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    @Override
    public int[] getEdges() {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    @Override
    public boolean noMorePelletsToGather() {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    @Override
    public int maxPotentialPellets() {
        int pelletsLeft = getPelletsLeft();
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    public String toString() {
        return super.toString();
    }
}
