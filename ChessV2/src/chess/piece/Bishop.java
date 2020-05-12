package chess.piece;

import chess.Player;

public class Bishop extends Piece {
    private final int point = 3;

    public Bishop(Player player) {
        super("Bishop", player, 3, 'B');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
