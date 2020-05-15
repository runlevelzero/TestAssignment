package chess.piece;

import chess.*;
import chess.piece.utils.PieceUtils_Ng;
import chess.utils.ChessGameUtils_Ng;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Bishop extends Piece {
    private static final Label BISHOP_LABEL = Label.BISHOP;
    private static final int BISHOP_POINT_VALUE = 3;

    public Bishop(Player player) {
        super(BISHOP_LABEL, player, BISHOP_POINT_VALUE);
    }

    @Override
    public Move_Skeleton[] getMoveListFromCurrentPosition(GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    /* Notes
            x,y    x,y
            2,1 => 1,0;0,3
                   1,2;3,2
                   0,3;4,3
                       5,4
                       6,5
                       7,6

            0,0 =>     1,1
                       2,2
                       3,3
                       4,4
                       5,5
                       6,6
                       7,7

            0,1 =>     1,0
                       1,2
                       2,3
                       3,4
                       4,5
                       5,6
                       6,7

            0,2 =>     2,0
                       1,1
                       1,3
                       2,4
                       3,5
                       4,6
                       5,7

            1,0 => 0,1
                       2,1
                       3,2
                       4,3
                       5,4
                       6,5
                       7,6

            2,0 => 0,2
                   1,1
                       3,1
                       4,2
                       5,3
                       6,4
                       7,5

            7,7 =>     6,6
                       5,5
                       4,4
                       3,3
                       2,2
                       1,1
                       0,0

            0,7 =>     1,6
                       2,5
                       3,4
                       4,3
                       5,2
                       6,1
                       7,0

            7,0 =>     6,1
                       5,2
                       4,3
                       3,4
                       2,5
                       1,6
                       0,7

    */
    @Override
    public int[][] getEndpointListFromCurrentPosition(GridPosition current) {
        int[][] endPoints = new int[ChessGame.ROW_COUNT][ChessGame.COLUMN_COUNT];
        int[] curYX = ChessGameUtils_Ng.convertGridPositionTo2DYXArray(current);
        int y = curYX[ChessGameUtils_Ng.Y_INDEX], x = curYX[ChessGameUtils_Ng.X_INDEX];

        for (int row = 0; row < ChessGame.ROW_COUNT; row++) {
            for (int col = 0; col < ChessGame.COLUMN_COUNT; col++) {
                if (!PieceUtils_Ng.isCurrent(y, x, row, col)) {
                    if ((Math.abs(y - row) == Math.abs(x - col))) {
                        endPoints[row][col] = 1;
                    }
                }
            }
        }

        return endPoints;
    }
}
