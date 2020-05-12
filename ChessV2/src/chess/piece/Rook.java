package chess.piece;

import chess.Player;

public class Rook extends Piece {

    public Rook(Player player) {
        super("Rook", player, 5, 'R');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
