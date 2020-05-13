package chess;

/**
 @author Jeffrey Ng
 @created 2020-05-13 */
public enum Label {
    PAWN("Pawn", 'P'), ROOK("Rook", 'R'), KNIGHT("Knight", 'N'), BISHOP("Bishop", 'B'), QUEEN("Queen", 'Q'),
    KING("King", 'K');

    private final String label;
    private final char labelShort;

    Label(final String label, final char labelShort) {
        this.label = label;
        this.labelShort = labelShort;
    }

    public String getLabel() {
        return label;
    }

    public char getLabelShort() {
        return labelShort;
    }
}
