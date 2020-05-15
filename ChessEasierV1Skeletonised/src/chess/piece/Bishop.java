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
public class Bishop extends Piece {
    private static final Label BISHOP_LABEL = Label.BISHOP;
    private static final int BISHOP_POINT_VALUE = 3;

    public Bishop(Player player) {
        super(BISHOP_LABEL, player, BISHOP_POINT_VALUE);
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
        int[] currentPos = PieceUtils.convertGridPositionToCoordinates(current);
        int xPos         = currentPos[PieceUtils.X_POS],
            yPos         = currentPos[PieceUtils.Y_POS];

        List<Integer[]> possiblePositions = new ArrayList<>();
        for(int x = 1; x < 8; x++) {
            if(yPos + x < 8) possiblePositions.add(new Integer[] {xPos + x, yPos + x});
            if(yPos - x >= 0) possiblePositions.add(new Integer[] {xPos + x, yPos - x});
        }
        for(int x = 1; x < 8; x++) {
            if(xPos - x < 0) continue;
            if(yPos + x < 8) possiblePositions.add(new Integer[] {xPos - x, yPos + x});
            if(yPos - x >= 0) possiblePositions.add(new Integer[] {xPos - x, yPos - x});
        }
        return possiblePositions;
    }

    @Override
    public GridPosition[] path(GridPosition current, GridPosition end) {
        assert pathIsPossible(current, end);
        List<GridPosition> pathList = new ArrayList<>();
       if (current.getFile() < end.getFile()) {
           if(current.getRank() < end.getRank()) {
               for(int i = 1; i <= getDiagonalDistance(current,end); i++) {
                   pathList.add(GridPosition.translate("" + (char)(current.getFile() + i) + (char)('0' + Integer.parseInt(current.getRank() + "") + i)));
               }
           }
           else {
               for(int i = 1; i <= getDiagonalDistance(current,end); i++) {
                   pathList.add(GridPosition.translate("" + (char)(current.getFile() + i) + (char)('0' + Integer.parseInt(current.getRank() + "") - i)));
               }
           }
       }
       else {
           if(current.getRank() < end.getRank()) {
               for(int i = 1; i <= getDiagonalDistance(current,end); i++) {
                   pathList.add(GridPosition.translate("" + (char)(current.getFile() - i) + (char)('0' + Integer.parseInt(current.getRank() + "") + i)));
               }
           }
           else {
               for(int i = 1; i <= getDiagonalDistance(current,end); i++) {
                   pathList.add(GridPosition.translate("" + (char)(current.getFile() - i) + (char)('0' + Integer.parseInt(current.getRank() + "") - i)));
               }
           }
       }
       return PieceUtils.toArray(pathList);
    }
    private int getDiagonalDistance(GridPosition pt1, GridPosition pt2) {
        return Math.abs(pt1.getRank() - pt2.getRank());
    }
    @Override
    public boolean pathIsPossible(GridPosition current, GridPosition end) {
        int[] endPos     = PieceUtils.convertGridPositionToCoordinates(end);
        int[][] possibleMoves = getEndpointListFromCurrentPosition(current);

        return possibleMoves[endPos[1]][endPos[0]] == 1;
    }
}
