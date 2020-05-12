package chess.piece;

import chess.GridPosition;
import chess.Player;

public class Knight extends Piece {
    public Knight(Player player) {
        super("Knight", player, 3, 'N');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p, GridPosition currentPosition) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
