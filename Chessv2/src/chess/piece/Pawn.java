package chess.piece;

import chess.GridPosition;
import chess.Player;

import java.util.List;

public class Pawn extends Piece {
    private List<GridPosition> moveHistory;

    public Pawn(String label, Player player) {
        super(label, player);
    }

    @Override
    public List<List<String>> getMoves(Piece p) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public char singleCharacterRepr() {
        return 'P';
    }
}
