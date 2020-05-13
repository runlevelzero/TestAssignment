package test.piece;

import chess.GridPosition;
import chess.Player;
import chess.piece.Piece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 @author Jeffrey Ng
 @created 2020-05-13 */
public class PieceTest {
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

    protected GridPosition extractGridPositionFromTestName(String testName) {
        return GridPosition.translate(testName.substring(testName.length() - 2));
    }
}
