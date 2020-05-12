package chess.piece;

import chess.Player;

public class Queen extends Piece {

    public Queen(Player player) {
        super("Queen", player, 9, 'Q');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
