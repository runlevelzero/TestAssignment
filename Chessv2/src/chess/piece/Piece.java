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
}