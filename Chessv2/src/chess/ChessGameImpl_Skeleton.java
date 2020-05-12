package chess;

import chess.piece.*;

import java.util.ArrayList;
import java.util.List;

public class ChessGameImpl_Skeleton implements ChessGame {
    private Piece[][] board;
    private List<Move_Skeleton> moveHistory;

    public ChessGameImpl_Skeleton() {
        board = new Piece[8][8];
        board[0] = new Piece[]{
                new Rook("Rook", Player.BLACK), new Knight("Knight", Player.BLACK), new Bishop("Bishop", Player.BLACK),
                new King("King", Player.BLACK), new Queen("Queen", Player.BLACK), new Bishop("Bishop", Player.BLACK),
                new Knight("Knight", Player.BLACK), new Rook("Rook", Player.BLACK)
        };
        board[1] = new Piece[]{
                new Pawn("Pawn", Player.BLACK), new Pawn("Pawn", Player.BLACK), new Pawn("Pawn", Player.BLACK),
                new Pawn("Pawn", Player.BLACK), new Pawn("Pawn", Player.BLACK), new Pawn("Pawn", Player.BLACK),
                new Pawn("Pawn", Player.BLACK), new Pawn("Pawn", Player.BLACK)
        };
        board[6] = new Piece[]{
                new Pawn("Pawn", Player.WHITE), new Pawn("Pawn", Player.WHITE), new Pawn("Pawn", Player.WHITE),
                new Pawn("Pawn", Player.WHITE), new Pawn("Pawn", Player.WHITE), new Pawn("Pawn", Player.WHITE),
                new Pawn("Pawn", Player.WHITE), new Pawn("Pawn", Player.WHITE)
        };
        board[7] = new Piece[]{
                new Rook("Rook", Player.WHITE), new Knight("Knight", Player.WHITE), new Bishop("Bishop", Player.WHITE),
                new King("King", Player.WHITE), new Queen("Queen", Player.WHITE), new Bishop("Bishop", Player.WHITE),
                new Knight("Knight", Player.WHITE), new Rook("Rook", Player.WHITE)
        };

        moveHistory = new ArrayList<>();
    }

    @Override
    public Piece getPiece(GridPosition position) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    @Override
    public void movePiece(Piece piece, GridPosition end) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    @Override
    public void movePiece(Piece piece, char file, GridPosition end) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    @Override
    public boolean isCheckmated() {
        return isCheckmated(1);
    }

    @Override
    public boolean isCheckmated(int n) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    private static final String INNER_CELL_BUFFER = " ";
    private static final String LABEL_EDGE_BUFFER = " ";
    private static final String EMPTY_GRID_POSITION = "   ";
    private static final String WALL = "|";
    private static final String ROW_SEPARATOR = "   ----- ----- ----- ----- ----- ----- ----- -----";
    private static final String COL_DESC = "     A     B     C     D     E     F     G     H";

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int rowNo = 8;
        sb.append(COL_DESC).append('\n');
        for (Piece[] row : board) {
            sb.append(ROW_SEPARATOR).append('\n');
            sb.append(rowNo).append(LABEL_EDGE_BUFFER).append(WALL);
            for (Piece p : row) {
                sb.append(INNER_CELL_BUFFER);
                if (p != null) {
                    sb.append(p.getPlayer() == Player.BLACK ? "B_" : "W_");
                    sb.append(p.singleCharacterRepr());
                } else {
                    sb.append(EMPTY_GRID_POSITION);
                }
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
