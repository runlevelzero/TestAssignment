package chess;

import java.util.*;

public enum Piece {
    //    PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING;
    PAWN(null, null),
        BLACK_PAWN(PAWN, Player.BLACK),
        WHITE_PAWN(PAWN, Player.WHITE),
    ROOK(null, null),
        BLACK_ROOK(ROOK, Player.BLACK),
        WHITE_ROOK(ROOK, Player.WHITE),
    KNIGHT(null, null),
        BLACK_KNIGHT(KNIGHT, Player.BLACK),
        WHITE_KNIGHT(KNIGHT, Player.WHITE),
    BISHOP(null, null),
        BLACK_BISHOP(BISHOP, Player.BLACK),
        WHITE_BISHOP(BISHOP, Player.WHITE),
    QUEEN(null, null),
        BLACK_QUEEN(QUEEN, Player.BLACK),
        WHITE_QUEEN(QUEEN, Player.WHITE),
    KING(null, null),
        BLACK_KING(KING,Player.BLACK),
        WHITE_KING(KING, Player.WHITE);

    private Piece parent;
    private Player player;

    Piece(Piece parent, Player player) {
        this.parent = parent;
        this.player = player;
    }

    public static Set<List<String>> moveSet(Piece p) {
        Set<List<String>> validMoves = new HashSet<>();
        switch (p) {
            case PAWN:
                /*
                    Change in (y,x)
                          0         1         2         3         4
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   0 |   N/A   |   N/A   |  -2, +0 |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   1 |   N/A   |  -1, -1 |  -1, +0 |  -1, +1 |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   2 |   N/A   |   N/A   |    Q    |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   3 |   N/A   |  +1, -1 |  +1, +0 |  +1, +1 |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   4 |   N/A   |   N/A   |  +2, +0 |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                 */
                validMoves.add(new ArrayList<>(Arrays.asList("-2", "+0")));

                validMoves.add(new ArrayList<>(Arrays.asList("-1", "-1")));
                validMoves.add(new ArrayList<>(Arrays.asList("-1", "+0")));
                validMoves.add(new ArrayList<>(Arrays.asList("-1", "+1")));

                validMoves.add(new ArrayList<>(Arrays.asList("+1", "-1")));
                validMoves.add(new ArrayList<>(Arrays.asList("+1", "+0")));
                validMoves.add(new ArrayList<>(Arrays.asList("+1", "+1")));

                validMoves.add(new ArrayList<>(Arrays.asList("+2", "+0")));

                boolean isNonGenericPawn = p.parent != null;
                if (isNonGenericPawn) {
                    if (p.player == Player.BLACK) {
                        validMoves.remove(new ArrayList<>(Arrays.asList("+1", "-1")));
                        validMoves.remove(new ArrayList<>(Arrays.asList("+1", "+0")));
                        validMoves.remove(new ArrayList<>(Arrays.asList("+1", "+1")));

                        validMoves.remove(new ArrayList<>(Arrays.asList("+2", "+0")));
                    } else {
                        validMoves.remove(new ArrayList<>(Arrays.asList("-2", "+0")));

                        validMoves.remove(new ArrayList<>(Arrays.asList("-1", "-1")));
                        validMoves.remove(new ArrayList<>(Arrays.asList("-1", "+0")));
                        validMoves.remove(new ArrayList<>(Arrays.asList("-1", "+1")));

                    }
                }
                break;

            case ROOK:
                /*
                    Change in (y,x)
                          0         1         2         3         4
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   0 |   N/A   |   N/A   | -n+0,+0 |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   1 |   N/A   |   N/A   | -n+1,+0 |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   2 | +0,-n+0 | +0,-n+1 |    R    | +0,+n-1 | +0,+n-0 |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   3 |   N/A   |   N/A   | +n-1,+0 |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   4 |   N/A   |   N/A   | +n+0,+0 |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                 */
                validMoves.add(new ArrayList<>(Arrays.asList("-n", "+0")));

                validMoves.add(new ArrayList<>(Arrays.asList("+0", "-n")));
                validMoves.add(new ArrayList<>(Arrays.asList("+0", "+n")));

                validMoves.add(new ArrayList<>(Arrays.asList("+n", "+0")));
                break;
            case KNIGHT:
                /*
                    Change in (y,x)
                          0         1         2         3         4
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   0 |   N/A   |  -2, -1 |   N/A   |  -2, +1 |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   1 |  -1, -2 |   N/A   |   N/A   |   N/A   |  -1, +2 |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   2 |   N/A   |   N/A   |    K    |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   3 |  +1, -2 |   N/A   |   N/A   |   N/A   |  +1, +2 |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   4 |   N/A   |  +2, -1 |   N/A   |  +2, +1 |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                 */
                validMoves.add(new ArrayList<>(Arrays.asList("-2", "-1")));
                validMoves.add(new ArrayList<>(Arrays.asList("-2", "+1")));

                validMoves.add(new ArrayList<>(Arrays.asList("-1", "-2")));
                validMoves.add(new ArrayList<>(Arrays.asList("-1", "+2")));

                validMoves.add(new ArrayList<>(Arrays.asList("+1", "-2")));
                validMoves.add(new ArrayList<>(Arrays.asList("+1", "+2")));

                validMoves.add(new ArrayList<>(Arrays.asList("+2", "-1")));
                validMoves.add(new ArrayList<>(Arrays.asList("+2", "+1")));
                break;

            case BISHOP:
                /*
                    Change in (y,x)
                          0         1         2         3         4
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   0 |  -n, -n |   N/A   |   N/A   |   N/A   | -n,  +n |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   1 |   N/A   |-n+1,-n+1|   N/A   |-n+1,+n-1|   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   2 |   N/A   |   N/A   |    B    |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   3 |   N/A   |+n-1,-n+1|   N/A   |+n-1,+n-1|   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   4 |  +n, -n |   N/A   |   N/A   |   N/A   |  +n, +n |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                 */
                validMoves.add(new ArrayList<>(Arrays.asList("-n", "-n")));
                validMoves.add(new ArrayList<>(Arrays.asList("-n", "+n")));

                validMoves.add(new ArrayList<>(Arrays.asList("+0", "+0")));

                validMoves.add(new ArrayList<>(Arrays.asList("+n", "-n")));
                validMoves.add(new ArrayList<>(Arrays.asList("+n", "+n")));
                break;

            case QUEEN:
                /*
                    Change in (y,x)
                          0         1         2         3         4
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   0 |  -n, -n |   N/A   | -n+0, 0 |   N/A   | -n,  +n |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   1 |   N/A   |-n+1,-n+1| -n+1, 0 |-n+1,+n-1|   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   2 |  0,-n+0 |  0,-n+1 |    Q    |  0,+n-1 |  0,+n-0 |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   3 |   N/A   |+n-1,-n+1| +n-1, 0 |+n-1,+n-1|   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   4 |  +n, -n |   N/A   | +n+0, 0 |   N/A   |  +n, +n |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                 */
                validMoves.add(new ArrayList<>(Arrays.asList("-n", "-n")));
                validMoves.add(new ArrayList<>(Arrays.asList("-n", "+0")));
                validMoves.add(new ArrayList<>(Arrays.asList("-n", "+n")));

                validMoves.add(new ArrayList<>(Arrays.asList("+0", "-n")));
                validMoves.add(new ArrayList<>(Arrays.asList("+0", "+n")));

                validMoves.add(new ArrayList<>(Arrays.asList("+n", "-n")));
                validMoves.add(new ArrayList<>(Arrays.asList("+n", "+0")));
                validMoves.add(new ArrayList<>(Arrays.asList("+n", "+n")));
                break;

            case KING:
                /*
                    Change in (y,x)
                          0         1         2         3         4
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   0 |   N/A   |   N/A   |   N/A   |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   1 |   N/A   |  -1, -1 |  -1,  0 |  -1, +1 |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   2 |   N/A   |   0, -1 |    Q    |   0, +1 |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   3 |   N/A   |  +1, -1 |  +1,  0 |  +1, +1 |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                     |         |         |         |         |         |
                   4 |   N/A   |   N/A   |   N/A   |   N/A   |   N/A   |
                     |         |         |         |         |         |
                     |---------|---------|---------|---------|---------|
                 */
                validMoves.add(new ArrayList<>(Arrays.asList("-1", "-1")));
                validMoves.add(new ArrayList<>(Arrays.asList("-1", "+0")));
                validMoves.add(new ArrayList<>(Arrays.asList("-1", "+1")));

                validMoves.add(new ArrayList<>(Arrays.asList("+0", "-1")));
                validMoves.add(new ArrayList<>(Arrays.asList("+0", "+1")));

                validMoves.add(new ArrayList<>(Arrays.asList("+1", "-1")));
                validMoves.add(new ArrayList<>(Arrays.asList("+1", "+0")));
                validMoves.add(new ArrayList<>(Arrays.asList("+1", "+1")));
                break;
        }
        return validMoves;
    }

    public static String pieceToShorthandString(Piece p) {
        String translated = "   ";
        Piece piece = p;
        if (piece != null) {
            piece = p.parent;
            switch (piece) {
                case PAWN:
                    translated = "P";
                    break;

                case ROOK:
                    translated = "R";
                    break;

                case KNIGHT:
                    translated = "N";
                    break;

                case BISHOP:
                    translated = "B";
                    break;

                case QUEEN:
                    translated = "Q";
                    break;

                case KING:
                    translated = "K";
                    break;
            }
            translated = p.player == Player.BLACK ? "B_" + translated : "W_" + translated;
        }

        return translated;
    }
}
