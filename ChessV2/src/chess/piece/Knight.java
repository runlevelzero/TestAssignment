package chess.piece;

import chess.*;
import chess.piece.utils.PieceUtils_Ng;
import chess.utils.ChessGameUtils_Ng;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Knight extends Piece {
    private static final Label KNIGHT_LABEL = Label.KNIGHT;
    private static final int KNIGHT_POINT_VALUE = 3;
    private static final int KNIGHT_STEP_ONE_SIZE = 2;
    private static final int KNIGHT_STEP_TWO_SIZE = 1;

    public Knight(Player player) {
        super(KNIGHT_LABEL, player, KNIGHT_POINT_VALUE);
    }

    @Override
    public Move_Skeleton[] getMoveListFromCurrentPosition(GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    /* Notes
            x,y    x,y
            0,0 => 2,1
                   1,2

            1,0 => 3,1
                   2,2
                   0,2

            0,1 => 2,0
                   2,2
                   1,3


            1,1 => 3,0
                   3,2
                   2,3
                   0,3

            4,4 => 5,2 = 7
                   6,3 = 9
                   6,5 = 11
                   5,6 = 11
                   3,6 = 9
                   2,5 = 7
                   2,3 = 5
                   3,2 = 5


    */
    @Override
    public int[][] getEndpointListFromCurrentPosition(GridPosition current) {
        int[][] endPoints = new int[ChessGame.ROW_COUNT][ChessGame.COLUMN_COUNT];
        int[] curYX = ChessGameUtils_Ng.convertGridPositionTo2DYXArray(current);
        int y = curYX[ChessGameUtils_Ng.Y_INDEX], x = curYX[ChessGameUtils_Ng.X_INDEX];

        int lowY = Math.max(y - KNIGHT_STEP_ONE_SIZE, 0);
        int highY = Math.min(y + KNIGHT_STEP_ONE_SIZE, ChessGame.ROW_COUNT);
        int lowX = Math.max(x - KNIGHT_STEP_ONE_SIZE, 0);
        int highX = Math.min(x + KNIGHT_STEP_ONE_SIZE, ChessGame.COLUMN_COUNT);

        for (int row = lowY; row <= highY; row++) {
            for (int col = lowX; col <= highX; col++) {
                if (!PieceUtils_Ng.isCurrent(y, x, row, col)) {
                    boolean NE = (y - KNIGHT_STEP_ONE_SIZE == row && x + KNIGHT_STEP_TWO_SIZE == col) ||
                                 (y - KNIGHT_STEP_TWO_SIZE == row && x + KNIGHT_STEP_ONE_SIZE == col);
                    boolean SE = (y + KNIGHT_STEP_ONE_SIZE == row && x + KNIGHT_STEP_TWO_SIZE == col) ||
                                 (y + KNIGHT_STEP_TWO_SIZE == row && x + KNIGHT_STEP_ONE_SIZE == col);
                    boolean SW = (y + KNIGHT_STEP_ONE_SIZE == row && x - KNIGHT_STEP_TWO_SIZE == col) ||
                                 (y + KNIGHT_STEP_TWO_SIZE == row && x - KNIGHT_STEP_ONE_SIZE == col);
                    boolean NW = (y - KNIGHT_STEP_ONE_SIZE == row && x - KNIGHT_STEP_TWO_SIZE == col) ||
                                 (y - KNIGHT_STEP_TWO_SIZE == row && x - KNIGHT_STEP_ONE_SIZE == col);
                    if (NE || SE || SW || NW) {
                        endPoints[row][col] = 1;
                    }
                }
            }
        }

        return endPoints;
    }
}
