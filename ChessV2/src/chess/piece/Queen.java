package chess.piece;

import chess.GridPosition;
import chess.Player;

public class Queen extends Piece {
    private static final String QUEEN_STRING_REPR = "QUEEN";
    private static final int QUEEN_POINT_VALUE = 9;
    private static final char QUEEN_SINGLE_CHAR_REPR = 'Q';

    public Queen(Player player) {
        super(QUEEN_STRING_REPR, player, QUEEN_POINT_VALUE, QUEEN_SINGLE_CHAR_REPR);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
