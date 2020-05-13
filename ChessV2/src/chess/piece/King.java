package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;

public class King extends Piece {
    private static final String KING_STRING_REPR = "KING";
    private static final int KING_POINT_VALUE = 0;
    private static final char KING_SINGLE_CHAR_REPR = 'K';

    public King(Player player) {
        super(KING_STRING_REPR, player, KING_POINT_VALUE, KING_SINGLE_CHAR_REPR);
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
