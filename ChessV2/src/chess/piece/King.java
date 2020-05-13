package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;
import chess.Label;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class King extends Piece {
    private static final Label KING_LABEL = Label.KING;
    private static final int KING_POINT_VALUE = 0;

    public King(Player player) {
        super(KING_LABEL, player, KING_POINT_VALUE);
    }

    @Override
    public Move_Skeleton[] getMoveListFromCurrentPosition(Piece piece, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public int[][] getEndpointListFromCurrentPosition(Piece piece, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
