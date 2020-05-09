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
        |* * * * * * * * * S * * * * * * * * *| 05
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
            A
        Postcondition(s):
            A
    */
    public void move(Direction direction, int distance);

    /*
    Precondition(s):
        A
    Postcondition(s):
        A
    */
    public int getPelletsEaten();

    /*
        Precondition(s):
            A
        Postcondition(s):
            A
    */
    public int getPoints();
}

