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
    public int[][] getYXDeltasFromCurrentPosition(Piece p, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public Move_Skeleton[] getMoveListFromCurrentPosition(Piece p, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public int[][] getEndpointListFromCurrentPosition(Piece p, GridPosition current) {
        int[][] generid8x8 = new int[8][8];
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
