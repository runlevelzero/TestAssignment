package chess.piece;

import chess.GridPosition;
import java.util.Arrays;
import java.util.List;

public class PieceUtils {
    public static final int X_POS = 0,
                            Y_POS = 1;
    public static int[] convertGridPositionToCoordinates(GridPosition position) {
        int[] returnPosition = new int[2];


        //Horizontal Positioning
        returnPosition[X_POS] = (int)(position.getFile()-'A');

        //Vertical Positioning
        returnPosition[Y_POS] = 8-Integer.parseInt(""+ position.getRank());

        return returnPosition;
    }

    public static GridPosition[] toArray(List<GridPosition> positions) {
        GridPosition[] positionsArray = new GridPosition[positions.size()];
        for(int i = 0; i < positionsArray.length; i++) {
            positionsArray[i] = positions.get(i);
        }
        return positionsArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertGridPositionToCoordinates(GridPosition.translate("A1"))));
    }
}