package chess.piece;

import chess.Player;

public class Bishop extends Piece {
    public Bishop(String label, Player player) {
        super(label, player);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public char singleCharacterRepr() {
        return 'B';
    }
}
