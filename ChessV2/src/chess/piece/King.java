package chess.piece;

import chess.*;
import chess.piece.utils.PieceUtils_Ng;
import chess.utils.ChessGameUtils_Ng;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class King extends Piece {
    private static final Label KING_LABEL = Label.KING;
    private static final int KING_POINT_VALUE = 0;
    private static final int KING_STEP_SIZE = 1;

    public King(Player player) {
        super(KING_LABEL, player, KING_POINT_VALUE);
    }

    @Override
    public Move_Skeleton[] getMoveListFromCurrentPosition(GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public int[][] getEndpointListFromCurrentPosition(GridPosition current) {
        int[][] endPoints = new int[ChessGame.ROW_COUNT][ChessGame.COLUMN_COUNT];
        int[] curYX = ChessGameUtils_Ng.convertGridPositionTo2DYXArray(current);
        int y = curYX[ChessGameUtils_Ng.Y_INDEX], x = curYX[ChessGameUtils_Ng.X_INDEX];

        int lowY = Math.max(y - KING_STEP_SIZE, 0);
        int highY = Math.min(y + KING_STEP_SIZE, ChessGame.ROW_COUNT);
        int lowX = Math.max(x - KING_STEP_SIZE, 0);
        int highX = Math.min(x + KING_STEP_SIZE, ChessGame.COLUMN_COUNT);

        for (int row = lowY; row <= highY; row++) {
            for (int col = lowX; col <= highX; col++) {
                if (!PieceUtils_Ng.isCurrent(y, x, row, col)) {
                    endPoints[row][col] = 1;
                }
            }
        }

        return endPoints;
    }
}
