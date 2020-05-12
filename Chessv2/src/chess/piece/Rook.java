package chess.piece;

import chess.Player;

public class Rook extends Piece {
    public Rook(String label, Player player) {
        super(label, player);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public char singleCharacterRepr() {
        return 'R';
    }
}
