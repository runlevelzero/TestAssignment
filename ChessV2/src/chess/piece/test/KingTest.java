package chess.piece.test;

import chess.GridPosition;
import chess.piece.Piece;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertArrayEquals;

/**
 @author Jeffrey NgRookTest
 @created 2020-05-13 */
public class KingTest extends PieceTest {
    @Test
    public void kingA8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingA5() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingH1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingA1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingH8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {};

        assertArrayEquals(expected, actual);
    }
}
