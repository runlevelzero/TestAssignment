package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;
import chess.Label;

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
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
