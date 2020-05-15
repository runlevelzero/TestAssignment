package chess.piece;

import chess.GridPosition;
import chess.Label;
import chess.Move_Skeleton;
import chess.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Pawn extends Piece {
    private static final Label PAWN_LABEL = Label.PAWN;
    private static final int PAWN_POINT_VALUE = 1;

    public Pawn(Player player) {
        super(PAWN_LABEL, player, PAWN_POINT_VALUE);
    }

    @Override
    public Move_Skeleton[] getMoveListFromCurrentPosition(GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public int[][] getEndpointListFromCurrentPosition(GridPosition current) {
        int[][] endPointArray = new int[8][8];
        for(Integer[] position : getPossibleNextPositions(current)) {
            endPointArray[position[PieceUtils.Y_POS]][position[PieceUtils.X_POS]] = 1;
        }

        return endPointArray;
    }

    private List<Integer[]> getPossibleNextPositions(GridPosition current) {
        int[] initialPosition = PieceUtils.convertGridPositionToCoordinates(current);
        List<Integer[]> possiblePositions = new ArrayList<>();
        for(int y = initialPosition[PieceUtils.Y_POS] - 1; y < initialPosition[PieceUtils.Y_POS] + 2; y++) {
            if (y == initialPosition[1]) continue;
            else if(this.getPlayer() == Player.WHITE && y > initialPosition[1]) continue;
            else if(this.getPlayer() == Player.BLACK && y < initialPosition[1]) continue;
            if(y >= 0 && y < 8) {
                for(int x = initialPosition[PieceUtils.X_POS] - 1; x < initialPosition[PieceUtils.X_POS] + 2; x++) {
                    if(x < 0 || x >= 8) continue;
                    else if (x == initialPosition[PieceUtils.X_POS] && y == initialPosition[PieceUtils.Y_POS]) continue;
                    possiblePositions.add(new Integer[] {x,y});
                }
            }
        }
        if (this.getPlayer() == Player.WHITE && initialPosition[1] == 6) possiblePositions.add(new Integer[] {initialPosition[0], initialPosition[1] - 2});
        if (this.getPlayer() == Player.BLACK && initialPosition[1] == 1) possiblePositions.add(new Integer[] {initialPosition[0], initialPosition[1] + 2});

        return possiblePositions;
    }

    @Override
    public GridPosition[] path(GridPosition current, GridPosition end) {
        assert pathIsPossible(current, end);
        return new GridPosition[] {end};
    }

    @Override
    public boolean pathIsPossible(GridPosition current, GridPosition end) {
        int[] endPos     = PieceUtils.convertGridPositionToCoordinates(end);
        int[][] possibleMoves = getEndpointListFromCurrentPosition(current);

        return possibleMoves[endPos[1]][endPos[0]] == 1;

    }
}
