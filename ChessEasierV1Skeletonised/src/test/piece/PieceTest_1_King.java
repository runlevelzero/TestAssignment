package test.piece;

import chess.GridPosition;
import chess.Player;
import chess.piece.Piece;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static chess.GridPosition.A2;
import static chess.GridPosition.B1;
import static org.junit.Assert.assertArrayEquals;

/**
 @author Jeffrey Ng
 @created 2020-05-13 */
public class PieceTest_1_King {
    protected Piece getPieceFromTestName(String testName) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        String classNameAux = testName.substring(0, testName.length() - 2);
        char title = classNameAux.toUpperCase().charAt(0);
        String restOfTheClassName = classNameAux.substring(1);
        StringBuilder sb = new StringBuilder();
        String className = sb.append(title).append(restOfTheClassName).toString();
        Class<?> clazz = Class.forName(String.format("chess.piece.%s", className));
        Constructor<?> constructor = clazz.getConstructor(Player.class);
        return (Piece) constructor.newInstance(Player.WHITE);
    }

    protected Piece getPieceFromTestName_(String testName) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        String classNameAux = testName.substring(0, testName.length() - 4);
        char title = classNameAux.toUpperCase().charAt(0);
        String restOfTheClassName = classNameAux.substring(1);
        StringBuilder sb = new StringBuilder();
        String className = sb.append(title).append(restOfTheClassName).toString();
        Class<?> clazz = Class.forName(String.format("chess.piece.%s", className));
        Constructor<?> constructor = clazz.getConstructor(Player.class);
        return (Piece) constructor.newInstance(Player.WHITE);
    }

    protected GridPosition extractGridPositionFromTestName(String testName) {
        return GridPosition.translate(testName.substring(testName.length() - 2));
    }

    protected GridPosition extractGridPositionFromTestName_(String testName) {
        return GridPosition.translate(testName.substring(testName.length() - 4, testName.length() - 2));
    }

    @Test
    public void kingA8() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingA5() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingC3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 1, 1, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 1, 0, 0, 0, 0,},
                new int[] {0, 1, 1, 1, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingA1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition gp = extractGridPositionFromTestName(testName);
        Piece p = getPieceFromTestName(testName);

        int[][] actual = p.getEndpointListFromCurrentPosition(gp);
        int[][] expected = new int[][] {
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 0, 0, 0, 0, 0, 0, 0,},
                new int[] {1, 1, 0, 0, 0, 0, 0, 0,},
                new int[] {0, 1, 0, 0, 0, 0, 0, 0,},
                };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void kingA1A2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
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
    public void kingA1B1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {B1};

        assertArrayEquals(expected, actual);
    }

    @Test(expected = AssertionError.class)
    public void kingA1A3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {A2, null, null, null, null, null, null,};

        assertArrayEquals(expected, actual);
    }

    @Test(expected = AssertionError.class)
    public void kingA1C1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GridPosition endGP = extractGridPositionFromTestName(testName);
        GridPosition curGP = extractGridPositionFromTestName_(testName);
        Piece p = getPieceFromTestName_(testName);

        GridPosition[] actual = p.path(curGP, endGP);
        GridPosition[] expected = new GridPosition[] {A2, null, null, null, null, null, null,};

        assertArrayEquals(expected, actual);
    }
}
