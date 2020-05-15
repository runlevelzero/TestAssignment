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
public class Queen extends Piece {
    private static final Label QUEEN_LABEL = Label.QUEEN;
    private static final int QUEEN_POINT_VALUE = 9;

    public Queen(Player player) {
        super(QUEEN_LABEL, player, QUEEN_POINT_VALUE);
    }

    @Override
    public Move_Skeleton[] getMoveListFromCurrentPosition(GridPosition current) {
        throw new RuntimeException("NOW IMPLEMENTED YET");
    }

    @Override
    public int[][] getEndpointListFromCurrentPosition(GridPosition current) {
        int[][] endPointArray = new int[8][8];
        for(Integer[] position : getPossibleNextPositionsRook(current)) {
            endPointArray[position[PieceUtils.Y_POS]][position[PieceUtils.X_POS]] = 1;
        }
        for(Integer[] position : getPossibleNextPositionsBishop(current)) {
            endPointArray[position[PieceUtils.Y_POS]][position[PieceUtils.X_POS]] = 1;
        }

        return endPointArray;
    }
    private List<Integer[]> getPossibleNextPositionsRook(GridPosition current) {
        int[] currentPos = PieceUtils.convertGridPositionToCoordinates(current);
        int xPos         = currentPos[PieceUtils.X_POS],
                yPos         = currentPos[PieceUtils.Y_POS];
        List<Integer[]> positions = new ArrayList<>();
        for(int y = 0; y < 8; y++) {
            for(int x = 0; x < 8; x++) {
                if(x != xPos && y != yPos) continue;
                else if (x == xPos && y == yPos) continue;
                positions.add(new Integer[] {x,y});
            }
        }
        return positions;
    }
    private List<Integer[]> getPossibleNextPositionsBishop(GridPosition current) {
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
        if(isBishopPath(current,end)) {
            return bishopPath(current, end);
        }
        else {
            return rookPath(current, end);
        }
    }
    private int getDiagonalDistance(GridPosition pt1, GridPosition pt2) {
        return Math.abs(pt1.getRank() - pt2.getRank());
    }
    public GridPosition[] bishopPath(GridPosition current, GridPosition end) {
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
    public GridPosition[] rookPath(GridPosition current, GridPosition end) {
        assert pathIsPossible(current, end);
        int[] startPos = PieceUtils.convertGridPositionToCoordinates(current),
                endPos   = PieceUtils.convertGridPositionToCoordinates(end);
        List<GridPosition> pathList = new ArrayList<>();
        if(startPos[0] == endPos[0]) {
            if(current.getRank() < end.getRank()) {
                for (int currentRank = Integer.parseInt("" + current.getRank()) + 1; currentRank + '0' <= end.getRank(); currentRank++) {
                    pathList.add(GridPosition.translate("" + current.getFile() + currentRank));
                }
            }
            else {
                for (int currentRank = Integer.parseInt("" + end.getRank()) + 1; currentRank + '0' > current.getRank(); currentRank--) {
                    pathList.add(0, GridPosition.translate("" + current.getFile() + currentRank));
                }
            }
        }
        else {
            if(current.getFile() < end.getFile()) {
                for(char currentFile = (char)(current.getFile() + 1); currentFile <=  end.getFile(); currentFile++) {
                    pathList.add(GridPosition.translate("" + currentFile + current.getRank()));
                }
            }
            else {
                for(char currentFile = (char)(end.getFile() + 1); currentFile > current.getFile(); currentFile--) {
                    pathList.add(0, GridPosition.translate("" + currentFile + current.getRank()));
                }
            }

        }
        return PieceUtils.toArray(pathList);
    }

    private boolean isBishopPath(GridPosition current, GridPosition end) {
        return !(current.getRank() == end.getRank() || current.getFile() == end.getFile());
    }
    @Override
    public boolean pathIsPossible(GridPosition current, GridPosition end) {
        int[] endPos     = PieceUtils.convertGridPositionToCoordinates(end);
        int[][] possibleMoves = getEndpointListFromCurrentPosition(current);

        return possibleMoves[endPos[1]][endPos[0]] == 1;

    }
}
