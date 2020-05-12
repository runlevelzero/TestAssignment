package chess;

import java.util.*;

public class ChessGameImpl_Skeleton implements ChessGame {
    private List<List<Piece>> board;

    private static final int MAX_NO_PIECES = 32;

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

    static Map<Character, Integer> ROW_POSITION_TRANSLATOR = new HashMap<>();

    static {
        ROW_POSITION_TRANSLATOR.put('8', 0);
        ROW_POSITION_TRANSLATOR.put('7', 1);
        ROW_POSITION_TRANSLATOR.put('6', 2);
        ROW_POSITION_TRANSLATOR.put('5', 3);
        ROW_POSITION_TRANSLATOR.put('4', 4);
        ROW_POSITION_TRANSLATOR.put('3', 5);
        ROW_POSITION_TRANSLATOR.put('2', 6);
        ROW_POSITION_TRANSLATOR.put('1', 7);
    }

    static Map<Character, Integer> COL_POSITION_TRANSLATOR = new HashMap<>();

    static {
        COL_POSITION_TRANSLATOR.put('A', 0);
        COL_POSITION_TRANSLATOR.put('B', 1);
        COL_POSITION_TRANSLATOR.put('C', 2);
        COL_POSITION_TRANSLATOR.put('D', 3);
        COL_POSITION_TRANSLATOR.put('E', 4);
        COL_POSITION_TRANSLATOR.put('F', 5);
        COL_POSITION_TRANSLATOR.put('G', 6);
        COL_POSITION_TRANSLATOR.put('H', 7);
    }

    @Override
    public Piece getPiece(GridPosition position) {
        assert ROW_POSITION_TRANSLATOR.containsKey(position.row);
        assert COL_POSITION_TRANSLATOR.containsKey(position.column);

        int row = ROW_POSITION_TRANSLATOR.get(position.row);
        int col = COL_POSITION_TRANSLATOR.get(position.column);

        return board.get(row).get(col);
    }

    private static final Piece EMPTY_POSITION = null;
    private static final Piece NO_PIECE = null;

    @Override
    public void movePiece(GridPosition start, GridPosition end) {
        assert getPiece(start) != null;
//        assert isValidMove(start, end);

        int startRow = ROW_POSITION_TRANSLATOR.get(start.row);
        int startCol = COL_POSITION_TRANSLATOR.get(start.column);

        int endRow = ROW_POSITION_TRANSLATOR.get(end.row);
        int endCol = COL_POSITION_TRANSLATOR.get(end.column);

        Piece movingPiece = getPiece(start);
        Piece killedPiece = getPiece(end);
        boolean endIsEmpty = killedPiece == NO_PIECE;

        if (!endIsEmpty) {
            board.get(endRow).set(endCol, movingPiece);
            board.get(startRow).set(startCol, EMPTY_POSITION);
        }
    }

    @Override
    public boolean isValidMove(Piece piece, GridPosition end) {
        return true;
    }

    private static final String ROW_SEPARATOR = "|-----|-----|-----|-----|-----|-----|-----|-----|";
    private static final String INNER_CELL_BUFFER = " ";
    private static final String LABEL_EDGE_BUFFER = " ";
    private static final String COL_DESC = "A     B     C     D     E     F     G     H";

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int rowNo = 8;
        sb.append("     " + COL_DESC + '\n');
        for (List<Piece> row : board) {
            sb.append(LABEL_EDGE_BUFFER).append(LABEL_EDGE_BUFFER).append(ROW_SEPARATOR).append('\n');
            sb.append(rowNo).append(LABEL_EDGE_BUFFER).append('|');
            for (Piece p : row) {
                sb.append(INNER_CELL_BUFFER);
                sb.append(Piece.pieceToShorthandString(p));
                sb.append(INNER_CELL_BUFFER + '|');
            }
            sb.append(LABEL_EDGE_BUFFER).append(rowNo).append('\n');
            rowNo -= 1;
        }
        sb.append("  " + ROW_SEPARATOR + '\n');
        sb.append("     " + COL_DESC);
        return sb.toString();
    }
}
