package chess.piece;

import chess.Player;

public class Queen extends Piece {
    public Queen(String label, Player player) {
        super(label, player);
    }

    @Override
    public int[][] getPotentialMoveDeltas(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public char singleCharacterRepr() {
        return 'Q';
    }
}
