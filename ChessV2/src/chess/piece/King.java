package chess.piece;

import chess.GridPosition;
import chess.Player;

public class King extends Piece {
    public King(Player player) {
        super("King", player, 0, 'K');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p, GridPosition currentPosition) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

}
