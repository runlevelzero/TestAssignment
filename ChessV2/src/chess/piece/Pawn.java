package chess.piece;

import chess.Player;

public class Pawn extends Piece {
    private final int point = 1;

    public Pawn(Player player) {
        super("Pawn", player, 1, 'P');
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }
}
