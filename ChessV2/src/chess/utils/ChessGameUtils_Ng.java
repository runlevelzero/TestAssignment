package chess.utils;

import static chess.Player.*;

import chess.GridPosition;
import chess.piece.*;

import java.util.HashMap;
import java.util.Map;

/**
 @author Jeffrey Ng
 @created 2020-05-13 */
public class ChessGameUtils_Ng {
    public static final int Y_INDEX = 0;
    public static final int X_INDEX = 1;
    static Map<Character, Integer> fileToCol;
    static Map<Character, Integer> rankToRow;
    static Map<Piece, Integer> maxAmountOfAParticularPiece;
    static {
        fileToCol = new HashMap<>();
        fileToCol.put('A', 0);
        fileToCol.put('B', 1);
        fileToCol.put('C', 2);
        fileToCol.put('D', 3);
        fileToCol.put('E', 4);
        fileToCol.put('F', 5);
        fileToCol.put('G', 6);
        fileToCol.put('H', 7);
    }

    static {
        rankToRow = new HashMap<>();
        rankToRow.put('8', 0);
        rankToRow.put('7', 1);
        rankToRow.put('6', 2);
        rankToRow.put('5', 3);
        rankToRow.put('4', 4);
        rankToRow.put('3', 5);
        rankToRow.put('2', 6);
        rankToRow.put('1', 7);
    }

    static {
        maxAmountOfAParticularPiece = new HashMap<>();
        maxAmountOfAParticularPiece.put(new Pawn(BLACK), 8);
        maxAmountOfAParticularPiece.put(new Pawn(WHITE), 8);
        maxAmountOfAParticularPiece.put(new Rook(BLACK), 2);
        maxAmountOfAParticularPiece.put(new Rook(WHITE), 2);
        maxAmountOfAParticularPiece.put(new Knight(BLACK), 2);
        maxAmountOfAParticularPiece.put(new Knight(WHITE), 2);
        maxAmountOfAParticularPiece.put(new Bishop(BLACK), 2);
        maxAmountOfAParticularPiece.put(new Bishop(WHITE), 2);
        maxAmountOfAParticularPiece.put(new King(BLACK), 1);
        maxAmountOfAParticularPiece.put(new King(WHITE), 1);
        maxAmountOfAParticularPiece.put(new Queen(BLACK), 1);
        maxAmountOfAParticularPiece.put(new Queen(WHITE), 1);
    }

    public static int convertFileToXIndex(char file) {
        return fileToCol.get(file);
    }

    public static int convertRankToYIndex(char rank) {
        return rankToRow.get(rank);
    }

    public static int[] convertGridPositionTo2DYXArray(GridPosition gp) {
        char file = gp.getFile();
        char rank = gp.getRank();

        return new int[] {convertRankToYIndex(rank), convertFileToXIndex(file)};
    }

    public static int getMaxNumberOfPotentialPiece(Piece p) {
        return maxAmountOfAParticularPiece.get(p);
    }
}
