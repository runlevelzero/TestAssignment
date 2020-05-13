package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;
import chess.Label;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Knight extends Piece {
    private static final Label KNIGHT_LABEL = Label.KNIGHT;
    private static final int KNIGHT_POINT_VALUE = 3;

    public Knight(Player player) {
        super(KNIGHT_LABEL, player, KNIGHT_POINT_VALUE);
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
