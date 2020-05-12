package chess;

import chess.piece.Piece;

public class Move {
    private final Piece piece;
    private final GridPosition start;
    private final GridPosition end;

    public Move(Piece piece, GridPosition end) {
        this.piece = piece;
        start = null; // Find where the piece initially was! May not include this particular instance variable
        this.end = end;
    }

    public void update() {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    public Piece getPiece() {
        return piece;
    }

    public GridPosition getStart() {
        return start;
    }

    public GridPosition getEnd() {
        return end;
    }

}
