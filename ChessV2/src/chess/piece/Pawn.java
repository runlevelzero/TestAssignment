package chess.piece;

import chess.*;
import chess.utils.ChessGameUtils_Ng;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Pawn extends Piece {
    private static final Label PAWN_LABEL = Label.PAWN;
    private static final int PAWN_POINT_VALUE = 1;
    private static final int PAWN_STEP_SIZE = 1;
    private static final int PAWN_SPECIAL_STEP_SIZE = 2;

    /* Notes
            x,y    x,y
            0,0 => 2,1
                   1,2
    */
    /*  Array Representation Board Grid
            0     1     2     3     4     5     6     7
         |-----|-----|-----|-----|-----|-----|-----|-----|
       0 |     |     |     |     |     |     |     |     | 0
         |-----|-----|-----|-----|-----|-----|-----|-----|
       1 |     |     |     |     |     |     |     |     | 1
         |-----|-----|-----|-----|-----|-----|-----|-----|
       2 |     |     |     |     |     |     |     |     | 2
         |-----|-----|-----|-----|-----|-----|-----|-----|
       3 |     |     |     |     |     |     |     |     | 3
         |-----|-----|-----|-----|-----|-----|-----|-----|
       4 |     |     |     |     |     |     |     |     | 4
         |-----|-----|-----|-----|-----|-----|-----|-----|
       5 |     |     |  S  |     |     |     |     |     | 5
         |-----|-----|-----|-----|-----|-----|-----|-----|
       6 |     |     |     |     |     |     |     |     | 6
         |-----|-----|-----|-----|-----|-----|-----|-----|
       7 |     |     |     |     |     |     |     |     | 7
         |-----|-----|-----|-----|-----|-----|-----|-----|
            0     1     2     3     4     5     6     7
    */

    public Pawn(Player player) {
        super(PAWN_LABEL, player, PAWN_POINT_VALUE);
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
        Player colour = this.getPlayer();

//        return endPoints;
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
