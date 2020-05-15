package chess.piece;

import chess.GridPosition;
import chess.Label;
import chess.Move_Skeleton;
import chess.Player;

import java.util.ArrayList;
import java.util.List;

/**
 @author Jeffrey Ng
 @created 2020-05-12 */
public class Knight extends Piece {
    private static final Label KNIGHT_LABEL = Label.KNIGHT;
    private static final int KNIGHT_POINT_VALUE = 3;

    public Knight(Player player) {
        super(KNIGHT_LABEL, player, KNIGHT_POINT_VALUE);
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
        int[][] possibilities = {
                {-2, -1}, {-2,  1},
                {-1, -2}, { 1, -2},
                { 2, -1}, { 2,  1},
                {-1,  2}, { 1,  2}
        };
        int[] currPos = PieceUtils.convertGridPositionToCoordinates(current);
        List<Integer[]> possibileMoves = new ArrayList<>();
        for(int[] combo : possibilities) {
            int xPos = currPos[0] + combo[1],
                yPos = currPos[1] + combo[0];
            if(xPos >= 0 && xPos < 8 && yPos >= 0 && yPos < 8) possibileMoves.add(new Integer[] {xPos,yPos});
        }
        return possibileMoves;
    }
    @Override
    public GridPosition[] path(GridPosition current, GridPosition end) {
        assert pathIsPossible(current, end);
        GridPosition[] path = new GridPosition[3];
        path[2] = end;
        String str1,str2;
        if(current.getRank() - end.getRank() == 2) {
            str1 = "" + current.getFile() + (char)('0' + Integer.parseInt(current.getRank() + "") - 1);
            str2 = "" + current.getFile() + (char)('0' + Integer.parseInt(current.getRank() + "") - 2);

        }
        else if(current.getRank() - end.getRank() == -2){

            str1 = ("" + current.getFile() + (char)('0' + Integer.parseInt(""+ current.getRank()) + 1));
            str2 = ("" + current.getFile() + (char)('0' + Integer.parseInt(current.getRank() + "") + 2));
        }
        else if(current.getFile() - end.getFile() == 2){
            str1 = ("" + (char)(current.getFile() - 1) + current.getRank());
            str2 = ("" + (char)(current.getFile() - 2) + current.getRank());
        }
        else{
            str1 = ("" + (char)(current.getFile() + 1) + current.getRank());
            str2 = ("" + (char)(current.getFile() + 2) + current.getRank());
        }
        path[0] = GridPosition.translate(str1);
        path[1] = GridPosition.translate(str2);
        return path;
    }

    @Override
    public boolean pathIsPossible(GridPosition current, GridPosition end) {
        int[] endPos     = PieceUtils.convertGridPositionToCoordinates(end);
        int[][] possibleMoves = getEndpointListFromCurrentPosition(current);

        return possibleMoves[endPos[1]][endPos[0]] == 1;
    }
}
