package chess.piece;

import chess.Player;

import java.util.List;

public abstract class Piece {
    private final String label;
    private final Player player;

    public Piece(final String label, final Player player) {
        this.label = label;
        this.player = player;
    }

    public abstract List<List<String>> getMoves(Piece p);

    public abstract char singleCharacterRepr();

    public String getLabel() {
        return label;
    }

    public Player getColour() {
        return player;
    }
}