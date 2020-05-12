package test;

import org.junit.Test;

import pacman.Direction;
import pacman.PacManNavigator;
import pacman.PacManNavigatorImpl_Skeleton;


public class PacManNavigatorImplTest_LEVEL1_EASY {
    public final Direction N = Direction.N, E = Direction.E, S = Direction.S, W = Direction.W;

    protected char[][] buildMazeSimpleNoCherries() {
        String row01 = "|===================|";
        String row02 = "|*******************|";
        String row03 = "|*|*|==|*|=|*|==|*|*|";
        String row04 = "|*|*|==|*|=|*|==|*|*|";
        String row05 = "|*******************|";
        String row06 = "|*|=|*|*|=O=|*|*|=|*|";
        String row07 = "|*|***|***|***|*****|";
        String row08 = "|*|===|=|*|*|=|===|*|";
        String row09 = "|*******|*|*|*******|";
        String row10 = "|*|====|**|**|====|*|";
        String row11 = "|*|******|=|******|*|";
        String row12 = "|***|==|*****|==|***|";
        String row13 = "|===================|";
        char[][] maze = new char[][]{
                row01.toCharArray(), row02.toCharArray(), row03.toCharArray(), row04.toCharArray(), row05.toCharArray(),
                row06.toCharArray(), row07.toCharArray(), row08.toCharArray(), row09.toCharArray(), row10.toCharArray(),
                row11.toCharArray(), row12.toCharArray(), row13.toCharArray()
        };


        return maze;
    }

    protected PacManNavigator getPacManSimpleNoCherries(int maxTurns) {
        return new PacManNavigatorImpl_Skeleton(buildMazeSimpleNoCherries(), maxTurns);
    }

    @Test
    public void test1() {
        final int maxTurns = 10;
        PacManNavigator navigator = getPacManSimpleNoCherries(maxTurns);
        System.out.println(navigator);

        //        assertEquals(10, navigator.maxPotentialPellets());
        //
        //        navigator.move(E);
        //        navigator.move(E);
        //        navigator.move(E);
        //        navigator.move(S);
        //        navigator.move(S);
        //        navigator.move(W);
        //        navigator.move(W);
        //
        //        assertEquals(3, navigator.movesLeft());
        //        assertFalse(navigator.noMorePelletsToGather());
        //        assertArrayEquals(new int[]{1, 1, 0, 0}, navigator.getEdges());

    }

}