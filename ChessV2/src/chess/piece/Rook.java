package chess.piece;

import chess.GridPosition;
import chess.Player;

public class Rook extends Piece {
    private static final String ROOK_STRING_REPR = "ROOK";
    private static final int ROOK_POINT_VALUE = 5;
    private static final char ROOK_SINGLE_CHAR_REPR = 'R';

    public Rook(Player player) {
        super(ROOK_STRING_REPR, player, ROOK_POINT_VALUE, ROOK_SINGLE_CHAR_REPR);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
