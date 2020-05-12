package test;

import chess.Player;
import chess.piece.Rook;
import org.junit.Test;
import chess.ChessGame;
import chess.ChessGameImpl_Skeleton;

import static org.junit.Assert.*;

public class ChessGameImplTest_LEVEL1_EASY {
    public final Player black = Player.BLACK, white = Player.WHITE;

    protected ChessGame getChessGame() {
        return new ChessGameImpl_Skeleton();
    }

    @Test
    public void test1() {
        ChessGame game = getChessGame();
    }
    @Test
    public void pieceEqualityTest() {
        Rook blackRook1 = new Rook("Rook", black);
        Rook blackRook2 = new Rook("Rook", black);

        assertEquals(blackRook1, blackRook2);
    }
}
