package chess;

public enum Player {
    BLACK("Black"), WHITE("White");
    private final String player;

    Player(final String player) {
        this.player = player;
    }

    public static String translate(Player player) {
        assert player != null;
        return player.player;
    }
}
