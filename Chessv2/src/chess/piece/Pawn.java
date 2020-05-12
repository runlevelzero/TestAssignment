package chess.piece;

import chess.Player;

public class Pawn extends Piece {
    public Pawn(String label, Player player) {
        super(label, player);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public char singleCharacterRepr() {
        return 'P';
    }
}
