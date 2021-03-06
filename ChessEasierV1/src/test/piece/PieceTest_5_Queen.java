package test.piece;

import chess.GridPosition;
import chess.piece.Piece;
import org.junit.Test;

import static chess.GridPosition.*;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertArrayEquals;

/**
 @author Jeffrey Ng
 @created 2020-05-13 */
public class PieceTest_5_Queen extends PieceTest_4_Bishop {
    @Test
    public void queenA8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 1, 1, 1, 1, 1, 1, 1,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {1, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {1, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {1, 0, 0, 0, 1, 0, 0, 0,},
                new int[] {1, 0, 0, 0, 0, 1, 0, 0,},
                new int[] {1, 0, 0, 0, 0, 0, 1, 0,},
                new int[] {1, 0, 0, 0, 0, 0, 0, 1,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenA5() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {1, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {1, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 1, 1, 1, 1, 1, 1,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {1, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {1, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {1, 0, 0, 0, 1, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenC3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 1, 0, 0, 0, 0, 1,},
                new int[] {0, 0, 1, 0, 0, 0, 1, 0,},
                new int[] {0, 0, 1, 0, 0, 1, 0, 0,},
                new int[] {1, 0, 1, 0, 1, 0, 0, 0,},
                new int[] {0, 1, 1, 1, 0, 0, 0, 0,},
                new int[] {1, 1, 0, 1, 1, 1, 1, 1,},
                new int[] {0, 1, 1, 1, 0, 0, 0, 0,},
                new int[] {1, 0, 1, 0, 1, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenA1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {1, 0, 0, 0, 0, 0, 0, 1,},
                new int[] {1, 0, 0, 0, 0, 0, 1, 0,},
                new int[] {1, 0, 0, 0, 0, 1, 0, 0,},
                new int[] {1, 0, 0, 0, 1, 0, 0, 0,},
                new int[] {1, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {1, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 1, 1, 1, 1, 1, 1,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenA1B2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {B2,};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenA1H8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {B2, C3, D4, E5, F6, G7, H8};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenA1A2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {A2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenA1B1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {B1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void queenA1H1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {B1, C1, D1, E1, F1, G1, H1,};

        assertArrayEquals(expected, actual);
    }
}
