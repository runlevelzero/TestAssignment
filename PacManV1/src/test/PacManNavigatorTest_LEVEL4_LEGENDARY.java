package test;

import pacman.PacManNavigator;
import pacman.PacManNavigatorImpl_Skeleton;

public class PacManNavigatorTest_LEVEL4_LEGENDARY extends PacManNavigatorTest_LEVEL3_HEROIC {

    protected PacManNavigator getPackManSimple4RandomCherries(int maxTurns) {
        return new PacManNavigatorImpl_Skeleton(buildMazeSimple4RandomCherries(), maxTurns);
    }

}