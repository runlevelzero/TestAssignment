package chess.piece;

import chess.GridPosition;
import chess.Player;

public class Pawn extends Piece {
    private static final String PAWN_STRING_REPR = "PAWN";
    private static final int PAWN_POINT_VALUE = 1;
    private static final char PAWN_SINGLE_CHAR_REPR = 'P';

    public Pawn(Player player) {
        super(PAWN_STRING_REPR, player, PAWN_POINT_VALUE, PAWN_SINGLE_CHAR_REPR);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
