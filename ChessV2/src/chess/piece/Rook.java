package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;
import chess.Label;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Rook extends Piece {
    private static final Label ROOK_LABEL = Label.ROOK;
    private static final int ROOK_POINT_VALUE = 5;

    public Rook(Player player) {
        super(ROOK_LABEL, player, ROOK_POINT_VALUE);
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
