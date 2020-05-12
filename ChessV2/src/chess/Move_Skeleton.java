package chess;

import chess.piece.Piece;

public class Move_Skeleton {
    private final Piece piece;
    private final GridPosition current;
    private final GridPosition end;

    public Move_Skeleton(Piece piece, GridPosition current, GridPosition end) {
        assert isAmbiguousMove(piece, end);
        assert isValidMove(piece, end);

        this.piece = piece;
        this.current = current;
        this.end = end;
    }

    public boolean isAmbiguousMove(Piece piece, GridPosition end) {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    public boolean isValidMove(Piece piece, GridPosition end) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    public int[] getYXDelta() {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    public Piece getPiece() {
        return piece;
    }

    public GridPosition getCurrent() {
        return current;
    }

    public GridPosition getEnd() {
        return end;
    }

}
