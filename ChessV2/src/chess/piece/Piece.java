package chess.piece;

import chess.GridPosition;
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
        labelToPoint.put("pawn", 1);
        labelToPoint.put("rook", 5);
        labelToPoint.put("knight", 3);
        labelToPoint.put("bishop", 3);
        labelToPoint.put("queen", 9);
        labelToPoint.put("king", 0);
    }

    public Piece(final String label, final Player player, final int pointValue, final char singleCharacterRepr) {
        assert labelToPoint.containsKey(label.toLowerCase());
        assert labelToPoint.get(label.toLowerCase()) == pointValue;

        this.player = player;
        this.pointValue = pointValue;
        this.label = label;
        this.singleCharacterRepr = singleCharacterRepr;
    }

    public abstract int[][] getPotentialMoveDeltas(Piece p, GridPosition currentPosition);

    public String getLabel() {
        return label;
    }

    public Player getPlayer() {
        return player;
    }

    public char getSngleCharacterRepr() {
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