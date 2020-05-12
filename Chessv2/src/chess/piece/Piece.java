package chess.piece;

import chess.Player;

public abstract class Piece {
    private final String label;
    private final Player player;

    public Piece(final String label, final Player player) {
        this.label = label;
        this.player = player;
    }

    public abstract int[][] getPotentialMoveDeltas(Piece p);

    public abstract char singleCharacterRepr();

    public String getLabel() {
        return label;
    }

    public Player getPlayer() {
        return player;
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
        int hashCode = 256;
        final int mul = 18;

        hashCode = mul * hashCode + label.hashCode();
        hashCode = mul * hashCode + player.hashCode();

        return hashCode;
    }
}