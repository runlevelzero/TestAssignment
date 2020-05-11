package test;

import org.junit.Test;

import static org.junit.Assert.*;

import pacman.PacManNavigator;
import pacman.PacManNavigatorImpl_Skeleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacManNavigatorTest_LEVEL2_NORMAL extends PacManNavigatorImplTest_LEVEL1_EASY {

    private String composite(List<String> rows) {
        StringBuilder sb = new StringBuilder();
        for (String row : rows) {
            sb.append(row).append('\n');
        }
        return sb.toString().trim();
    }

    protected String buildMazeSimple4Cherries() {
        String row01 = "|-------------------------------------|";
        String row02 = "|C * * * * * * * * * * * * * * * * * C|";
        String row03 = "|*|---|*|-----|*|-----|*|---|*|-----|*|";
        String row04 = "|*|---|*|-----|*|-----|*|---|*|-----|*|";
        String row05 = "|* * * * * * * * * O * * * * * * * * *|";
        String row06 = "|*|-----|*|-|*|---------|*|-|*|-----|*|";
        String row07 = "|* * * * *|-|* * *| |* * *|-|* * * * *|";
        String row08 = "|-------|*|-----|*| |*|-----|*|-------|";
        String row09 = "|* * * * * * *| |*|-|*| |* * * * * * *|";
        String row10 = "|*|---------|*| |*|*|*| |*|---------|*|";
        String row11 = "|*|-|* * * * *|-|*|-|*|-|* * * * *|-|*|";
        String row12 = "|* C *|-----|* * *| |*|*|*|-----|* C *|";
        String row13 = "|-------------------------------------|";
        List<String> rows = new ArrayList<>(
                Arrays.asList(row01, row02, row03, row04, row05, row06, row07, row08, row09, row10, row11, row12,
                        row13));

        return composite(rows);
    }

    protected PacManNavigator getPackManSimple4Cherries(int maxTurns) {
        return new PacManNavigatorImpl_Skeleton(buildMazeSimple4Cherries(), maxTurns);
    }

    @Test
    public void test3() {
        PacManNavigator board = getPackManSimple4Cherries(10);
        board.move(N);
    }

    @Test
    public void test4() {
        PacManNavigator board = getPackManSimple4Cherries(5);
        board.move(N);
    }
}