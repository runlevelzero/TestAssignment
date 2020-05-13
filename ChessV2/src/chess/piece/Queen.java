package chess.piece;

import chess.*;
import chess.piece.utils.PieceUtils_Ng;
import chess.utils.ChessGameUtils_Ng;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Queen extends Piece {
    private static final Label QUEEN_LABEL = Label.QUEEN;
    private static final int QUEEN_POINT_VALUE = 9;

    public Queen(Player player) {
        super(QUEEN_LABEL, player, QUEEN_POINT_VALUE);
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

        Piece rook = new Rook(Player.BLACK);
        Piece bishop = new Bishop(Player.WHITE);

        int[][] rookEndpoints = rook.getEndpointListFromCurrentPosition(current);
        int[][] bishopEndPoints = bishop.getEndpointListFromCurrentPosition(current);

        for (int row = 0; row < ChessGame.ROW_COUNT; row++) {
            for (int col = 0; col < ChessGame.COLUMN_COUNT; col++) {
                if (!PieceUtils_Ng.isCurrent(y, x, row, col)) {
                    endPoints[row][col] = rookEndpoints[row][col] + bishopEndPoints[row][col];
                }
            }
        }

        return endPoints;
    }
}
