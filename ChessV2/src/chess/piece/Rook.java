package chess.piece;

import chess.GridPosition;
import chess.Player;

public class Rook extends Piece {

    public Rook(Player player) {
        super("Rook", player, 5, 'R');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p, GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
