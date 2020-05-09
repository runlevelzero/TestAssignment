package chess;

public enum Player {
    BLACK("Black"), WHITE("White");
    private String player;

    private Player(final String player) {
        this.player = player;
    }
}
