package test;

import org.junit.Test;

import static org.junit.Assert.*;

import pacman.Direction;
import pacman.PacManNavigator;
import pacman.PacManNavigatorImpl_Ng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PacManNavigatorImplTest_LEVEL1_EASY {
    public final Direction N = Direction.N, E = Direction.E, S = Direction.S, W = Direction.W;

    private String composite(List<String> rows) {
        StringBuilder sb = new StringBuilder();
        for (String row : rows) {
            sb.append(row).append('\n');
        }
        return sb.toString().trim();
    }

    protected String buildMazeSimpleNoCherries() {
        String row01 = "|-------------------------------------|";
        String row02 = "|* * * * * * * * * * * * * * * * * * *|";
        String row03 = "|*|---|*|-----|*|-----|*|---|*|-----|*|";
        String row04 = "|*|---|*|-----|*|-----|*|---|*|-----|*|";
        String row05 = "|* * * * * * * * * O * * * * * * * * *|";
        String row06 = "|*|-----|*|-|*|---------|*|-|*|-----|*|";
        String row07 = "|* * * * *|-|* * *| |* * *|-|* * * * *|";
        String row08 = "|-------|*|-----|*| |*|-----|*|-------|";
        String row09 = "|* * * * * * *| |*|-|*| |* * * * * * *|";
        String row10 = "|*|---------|*| |*|*|*| |*|---------|*|";
        String row11 = "|*|-|* * * * *|-|*|-|*|-|* * * * *|-|*|";
        String row12 = "|* * *|-----|* * *| |*|*|*|-----|* * *|";
        String row13 = "|-------------------------------------|";
        List<String> rows = new ArrayList<>(
                Arrays.asList(row01, row02, row03, row04, row05, row06, row07, row08, row09, row10, row11, row12,
                        row13));

        return composite(rows);
    }

    protected PacManNavigator getPacManSimpleNoCherries(int maxTurns) {
        return new PacManNavigatorImpl_Ng(buildMazeSimpleNoCherries(), maxTurns);
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