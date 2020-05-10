package pacman;

import java.util.*;

public interface PacManNavigator {
    public static final char VERTICAL_EDGE = '|';
    public static final char HORIZONTAL_EDGE = '-';
    /*
        39 width
        13 height
        |-------------------------------------| 01
        |* * * * * * * * * * * * * * * * * * *| 02
        |*|---|*|-----|*|-----|*|---|*|-----|*| 03
        |*|---|*|-----|*|-----|*|---|*|-----|*| 04
        |* * * * * * * * * O * * * * * * * * *| 05
        |*|-----|*|-|*|---------|*|-|*|-----|*| 06
        |* * * * *|-|* * *| |* * *|-|*|*|*|*|*| 07
        |-------|*|-----|*| |*|-----|*|-------| 08
        |* * * * * * *| |*|-|*| |* * * * * * *| 09
        |*|---------|*| |*|*|*| |*|---------|*| 10
        |*|-|* * * * *|-|*|-|*|-|*|*|*|*|*|-|*| 11
        |* * *|-----|* * *| |*|*|*|-----|*|*|*| 12
        |-------------------------------------| 13
    */

    /*
        Precondition(s):
            direction           ==>     charAt(directionOfCurrentPosition) != edge
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
    public int maxPotentialPellets();

    /*
        Precondition(s):
            A
        Postcondition(s):
            A
    */
    public boolean noMorePelletsToGather();

    /*
        Precondition(s):
            A
        Postcondition(s):
            A
    */
    public int[] getEdges();
}

