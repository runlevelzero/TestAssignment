package pacman;

public interface PacManNavigator {
    /*
        Precondition(s):
            direction           ==>     maze.charAt(directionOfCurrentPosition) != edgeCharacter
            direction == N      ==>     tracker[previousMove] != S
            direction == S      ==>     tracker[previousMove] != N
            direction == E      ==>     tracker[previousMove] != W
            direction == W      ==>     tracker[previousMove] != E
            !noMorePelletsToGather()

        Postcondition(s):
            A
    */
    public void move(Direction direction);

    /*
        Precondition(s):
            A
        Postcondition(s):
            A
    */
    public int movesLeft();

    /*
        Precondition(s):
            A
        Postcondition(s):
            A
    */
//    public int[][] getLegalMoves();

    /*
        Precondition(s):
            A
        Postcondition(s):
            A
    */
    public boolean noMorePelletsToGather();
}

