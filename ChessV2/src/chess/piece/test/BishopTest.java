package chess.piece.test;

import chess.GridPosition;
import chess.piece.Piece;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 @author Jeffrey Ng
 @created 2020-05-13 */
public class BishopTest extends PieceTest {
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
    public void bishopH1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {1, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 1, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 1, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 1, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
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
    public void bishopH8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 1, 0,},
                new int[] {0, 0, 0, 0, 0, 1, 0, 0,},
                new int[] {0, 0, 0, 0, 1, 0, 0, 0,},
                new int[] {0, 0, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 1, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {1, 0, 0, 0, 0, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }
}
