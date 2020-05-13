package chess.piece;

import chess.GridPosition;
import chess.Move_Skeleton;
import chess.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class Piece {
    private final String label;
    private final int pointValue;
    private final Player player;
    private final char singleCharacterRepr;

    private static final Map<String, Integer> labelToPoint = new HashMap<>();

    static {
        labelToPoint.put("PAWN", 1);
        labelToPoint.put("ROOK", 5);
        labelToPoint.put("KNIGHT", 3);
        labelToPoint.put("BISHOP", 3);
        labelToPoint.put("QUEEN", 9);
        labelToPoint.put("KING", 0);
    }

    public Piece(final String label, final Player player, final int pointValue, final char singleCharacterRepr) {
        assert labelToPoint.containsKey(label.toUpperCase());
        assert labelToPoint.get(label.toUpperCase()) == pointValue;
        assert (label.toUpperCase().charAt(0) == Character.toUpperCase(singleCharacterRepr)) ||
               (label.toUpperCase().equals("KNIGHT") && ('N' == Character.toUpperCase(singleCharacterRepr)));

        this.player = player;
        this.pointValue = pointValue;
        this.label = label.toUpperCase();
        this.singleCharacterRepr = Character.toUpperCase(singleCharacterRepr);
    }

    /*
       Precondition(s):
                                    piece   !=  null
                                  current   !=  null

       Postcondition(s):
                                piece == PAWN   =>  0 <= rv.size <= 8
                                piece == ROOK   =>  0 <  rv.size <= 14
                              piece == KNIGHT   =>  0 <  rv.size <= 8
                              piece == BISHOP   =>  0 <  rv.size <= 13
                               piece == QUEEN   =>  0 <  rv.size <= 27
                                piece == KING   =>  0 <  rv.size <= 8
    */
    public abstract Move_Skeleton[] getMoveListFromCurrentPosition(Piece piece, GridPosition current);

    /*
        Precondition(s):
                                    piece   !=  null
                                  current   !=  null

        Postcondition(s):
                                rv.length   ==  8
                            rv.forEach(i)   =>  i.length == 8
            rv.forEach(i -> i.forEach(k))   =>  k == 0 || k == 1
                             rv[y][x] = 1   =>  y != currentTranslatedToYCoordinate &&
                                                x != currentTranslatedToXCoordinate
    */
    public abstract int[][] getEndpointListFromCurrentPosition(Piece piece, GridPosition current);

    public String getLabel() {
        return label;
    }

    public Player getPlayer() {
        return player;
    }

    public char getSingleCharacterRepr() {
        return singleCharacterRepr;
    }

    public int getPointValue() {
        return pointValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Piece)) {
            return false;
        }
        Piece piece = (Piece) obj;
        return piece.label.equals(this.label) && piece.player.equals(this.player);
    }

    @Override
    public int hashCode() {
        int hashCode = 1999;
        final int mul = 4 * 15 * 12 * 23; // 😄

        hashCode = mul * hashCode + label.hashCode();
        hashCode = mul * hashCode + player.hashCode();

        return hashCode;
    }
}