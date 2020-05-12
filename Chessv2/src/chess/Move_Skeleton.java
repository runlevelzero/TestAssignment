package chess;

import chess.piece.Piece;

public class Move_Skeleton {
    private final Piece piece;
    private final GridPosition start;
    private final GridPosition end;

    public Move_Skeleton(Piece piece, GridPosition end) {
        assert isAmbiguousMove(piece, end);
        assert isValidMove(piece, end);

        this.piece = piece;
        start = null; // Find where the piece initially is before the move! May not include this concept at all
        this.end = end;
    }

    public boolean isAmbiguousMove(Piece piece, GridPosition end) {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    public boolean isValidMove(Piece piece, GridPosition end) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    public int[] getDeltas() {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
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
