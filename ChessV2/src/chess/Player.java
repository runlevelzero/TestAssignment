package chess;

public enum Player {
    BLACK("Black"), WHITE("White");
    private final String player;

    Player(final String player) {
        this.player = player;
    }

    public static Player translate(String str) {
        assert str != null;
        return str.toLowerCase().equals("black") ? BLACK : WHITE;
    }

    public static String translate(Player p) {
        assert p != null;
        return p.player;
    }

}
