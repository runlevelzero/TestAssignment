package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;
import chess.Label;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Pawn extends Piece {
    private static final Label PAWN_LABEL = Label.PAWN;
    private static final int PAWN_POINT_VALUE = 1;

    public Pawn(Player player) {
        super(PAWN_LABEL, player, PAWN_POINT_VALUE);
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
