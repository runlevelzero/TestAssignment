package chess;

import java.util.*;

public class ChessGameImpl_Skeleton implements ChessGame {
    private List<List<Piece>> board;

    public ChessGameImpl_Skeleton() {
        board = new ArrayList<>(ROW_COUNT);
        for (int i = 0; i < ROW_COUNT; i++) {
            List<Piece> row = new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null));
            board.add(row);
        }
        board.set(0, new ArrayList<>(
                Arrays.asList(Piece.BLACK_ROOK, Piece.BLACK_KNIGHT, Piece.BLACK_BISHOP, Piece.BLACK_KING,
                        Piece.BLACK_QUEEN, Piece.BLACK_BISHOP, Piece.BLACK_KNIGHT, Piece.BLACK_ROOK)));

        board.set(1, new ArrayList<>(
                Arrays.asList(Piece.BLACK_PAWN, Piece.BLACK_PAWN, Piece.BLACK_PAWN, Piece.BLACK_PAWN, Piece.BLACK_PAWN,
                        Piece.BLACK_PAWN, Piece.BLACK_PAWN, Piece.BLACK_PAWN))

        );
        board.set(6, new ArrayList<>(
                Arrays.asList(Piece.WHITE_PAWN, Piece.WHITE_PAWN, Piece.WHITE_PAWN, Piece.WHITE_PAWN, Piece.WHITE_PAWN,
                        Piece.WHITE_PAWN, Piece.WHITE_PAWN, Piece.WHITE_PAWN)));

        board.set(7, new ArrayList<>(
                Arrays.asList(Piece.WHITE_ROOK, Piece.WHITE_KNIGHT, Piece.WHITE_BISHOP, Piece.WHITE_KING,
                        Piece.WHITE_QUEEN, Piece.WHITE_BISHOP, Piece.WHITE_KNIGHT, Piece.WHITE_ROOK)));

    }

    @Override
    public Piece getPiece(GridPosition position) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    @Override
    public void movePiece(GridPosition start, GridPosition end) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    @Override
    public boolean isValidMove(Piece piece, GridPosition end) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    private static final String INNER_CELL_BUFFER = " ";
    private static final String LABEL_EDGE_BUFFER = " ";
    private static final String WALL = "|";
    private static final String ROW_SEPARATOR = "  |-----|-----|-----|-----|-----|-----|-----|-----|";
    private static final String COL_DESC = "     A     B     C     D     E     F     G     H";

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int rowNo = 8;
        sb.append(COL_DESC).append('\n');
        for (List<Piece> row : board) {
            sb.append(ROW_SEPARATOR).append('\n');
            sb.append(rowNo).append(LABEL_EDGE_BUFFER).append(WALL);
            for (Piece p : row) {
                sb.append(INNER_CELL_BUFFER);
                sb.append(Piece.pieceToShorthandString(p));
                sb.append(INNER_CELL_BUFFER).append(WALL);
            }
            sb.append(LABEL_EDGE_BUFFER).append(rowNo).append('\n');
            rowNo -= 1;
        }
        sb.append(ROW_SEPARATOR).append('\n');
        sb.append(COL_DESC).append('\n');
        return sb.toString();
    }
}
