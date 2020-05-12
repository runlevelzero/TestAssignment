package chess.piece;

import chess.Player;

public class King extends Piece {
    public King(Player player) {
        super("King", player, 0, 'K');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

}
