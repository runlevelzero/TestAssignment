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
public class PieceTest_4_Bishop extends PieceTest_3_Knight {
    @Test
    public void bishopA8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 1, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 1, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 1, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 1,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void bishopA5() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 1, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void bishopC3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 0, 0, 0, 0, 1,},
                new int[] {0, 0, 0, 0, 0, 0, 1, 0,},
                new int[] {0, 0, 0, 0, 0, 1, 0, 0,},
                new int[] {1, 0, 0, 0, 1, 0, 0, 0,},
                new int[] {0, 1, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 1, 0, 0, 0, 0,},
                new int[] {1, 0, 0, 0, 1, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void bishopA1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 0, 0, 0, 0, 1,},
                new int[] {0, 0, 0, 0, 0, 0, 1, 0,},
                new int[] {0, 0, 0, 0, 0, 1, 0, 0,},
                new int[] {0, 0, 0, 0, 1, 0, 0, 0,},
                new int[] {0, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void bishopA1B2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
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
    public void bishopA1H8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {B2, C3, D4, E5, F6, G7, H8};

        assertArrayEquals(expected, actual);
    }

    @Test(expected = AssertionError.class)
    public void bishopA1A2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
    }
}
