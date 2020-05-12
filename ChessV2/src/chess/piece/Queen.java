package chess.piece;

import chess.GridPosition;
import chess.Player;

public class Queen extends Piece {

    public Queen(Player player) {
        super("Queen", player, 9, 'Q');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
