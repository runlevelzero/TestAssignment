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
public class Rook extends Piece {
    private static final Label ROOK_LABEL = Label.ROOK;
    private static final int ROOK_POINT_VALUE = 5;

    public Rook(Player player) {
        super(ROOK_LABEL, player, ROOK_POINT_VALUE);
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
    @Override
    public GridPosition[] path(GridPosition current, GridPosition end) {
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

    @Override
    public boolean pathIsPossible(GridPosition current, GridPosition end) {
        int[] endPos     = PieceUtils.convertGridPositionToCoordinates(end);
        int[][] possibleMoves = getEndpointListFromCurrentPosition(current);

        return possibleMoves[endPos[1]][endPos[0]] == 1;
    }
}
