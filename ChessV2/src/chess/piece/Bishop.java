package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;

public class Bishop extends Piece {
    private static final String BISHOP_STRING_REPR = "BISHOP";
    private static final int BISHOP_POINT_VALUE = 3;
    private static final char BISHOP_SINGLE_CHAR_REPR = 'B';

    public Bishop(Player player) {
        super(BISHOP_STRING_REPR, player, BISHOP_POINT_VALUE, BISHOP_SINGLE_CHAR_REPR);
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
