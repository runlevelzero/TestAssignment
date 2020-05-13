package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;

public class Knight extends Piece {
    private static final String KNIGHT_STRING_REPR = "KNIGHT";
    private static final int KNIGHT_POINT_VALUE = 3;
    private static final char KNIGHT_SINGLE_CHAR_REPR = 'N';

    public Knight(Player player) {
        super(KNIGHT_STRING_REPR, player, KNIGHT_POINT_VALUE, KNIGHT_SINGLE_CHAR_REPR);
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
