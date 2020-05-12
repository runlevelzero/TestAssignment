package chess.piece;

import chess.Player;

public class Knight extends Piece {
    public Knight(String label, Player player) {
        super(label, player);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public char singleCharacterRepr() {
        return 'N';
    }
}
