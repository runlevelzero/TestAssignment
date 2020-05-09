package test;

import org.junit.Test;
import pacman.PacManNavigator;
import pacman.PacManNavigatorImpl_Skeleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PacManNavigatorImpl_SkeletonTest {

    private String buildMaze() {
        String row01 = "|-------------------------------------|";
        String row02 = "|* * * * * * * * * * * * * * * * * * *|";
        String row03 = "|*|---|*|-----|*|-----|*|---|*|-----|*|";
        String row04 = "|*|---|*|-----|*|-----|*|---|*|-----|*|";
        String row05 = "|* * * * * * * * * S * * * * * * * * *|";
        String row06 = "|*|-----|*|-|*|---------|*|-|*|-----|*|";
        String row07 = "|* * * * *|-|* * *| |* * *|-|*|*|*|*|*|";
        String row08 = "|-------|*|-----|*| |*|-----|*|-------|";
        String row09 = "|* * * * * * *| |*|-|*| |* * * * * * *|";
        String row10 = "|*|---------|*| |*|*|*| |*|---------|*|";
        String row11 = "|*|-|* * * * *|-|*|-|*|-|*|*|*|*|*|-|*|";
        String row12 = "|* * *|-----|* * *| |*|*|*|-----|*|*|*|";
        String row13 = "|-------------------------------------|";
        List<String> rows = new ArrayList<>(
                Arrays.asList(row01, row02, row03, row04, row05, row06, row07, row08, row09, row10, row11, row12,
                        row13));

        StringBuilder sb1 = new StringBuilder();
        for (String row : rows) {
            sb1.append(row).append('\n');
        }
        String maze = sb1.toString().trim();

        final boolean RANDOMISE_CHERRY_POSITIONS = false;
        if (RANDOMISE_CHERRY_POSITIONS) {
            Random random = new Random();
            List<String> randomRows = new ArrayList<>(4);
            List<Integer> selectedRowsIndices = new ArrayList<>(4);
            for (int rounds = 0; rounds < 100; rounds++) {
                int row = 0;
                while (selectedRowsIndices.size() != 4) {
                    int randomIndex = random.nextInt(rows.size() - 2) + 1;
                    if (!selectedRowsIndices.contains(randomIndex)) {
                        randomRows.add(rows.get(randomIndex));
                        selectedRowsIndices.add(randomIndex);
                        row += 1;
                    }
                }
                if (rounds < 99) {
                    randomRows.clear();
                    selectedRowsIndices.clear();
                }
            }

            int count = 0;
            for (String row : randomRows) {
                boolean replaced = false;
                while (!replaced) {
                    int randomIndex = random.nextInt(row.length());
                    char randomChar = row.charAt(randomIndex);
                    replaced = randomChar == '*';
                    if (replaced) {
                        StringBuilder sb = new StringBuilder();
                        char cherry = 'C';
                        String head = row.substring(0, randomIndex);
                        String tail = row.substring(randomIndex + 1);
                        sb.append(head).append(cherry).append(tail);

                        rows.set(selectedRowsIndices.get(count), sb.toString());
                        count += 1;
                    }
                }
            }

            System.out.println();

            StringBuilder sb2 = new StringBuilder();
            for (String row : rows) {
                sb2.append(row).append('\n');
            }
            maze = sb2.toString().trim();
        }

        return maze;
    }
    protected PacManNavigator getPacMan(int maxTurns) {
        return new PacManNavigatorImpl_Skeleton(buildMaze(), maxTurns);
    }

    @Test
    public void test1() {
        PacManNavigator board = getPacMan(10);

    }
}