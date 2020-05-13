package chess.piece.utils;

import chess.ChessGame;

/**
 @author Jeffrey Ng
 @created 2020-05-13 */
public class PieceUtils_Ng {
    public static boolean isCurrent(int curY, int curX, int row, int col) {
        return row == curY && col == curX;
    }
}
