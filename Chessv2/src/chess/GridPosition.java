package chess;

import java.util.HashMap;
import java.util.Map;

public enum GridPosition {
    A1("A1"),
    A2("A2"),
    A3("A3"),
    A4("A4"),
    A5("A5"),
    A6("A6"),
    A7("A7"),
    A8("A8"),
    B1("B1"),
    B2("B2"),
    B3("B3"),
    B4("B4"),
    B5("B5"),
    B6("B6"),
    B7("B7"),
    B8("B8"),
    C1("C1"),
    C2("C2"),
    C3("C3"),
    C4("C4"),
    C5("C5"),
    C6("C6"),
    C7("C7"),
    C8("C8"),
    D1("D1"),
    D2("D2"),
    D3("D3"),
    D4("D4"),
    D5("D5"),
    D6("D6"),
    D7("D7"),
    D8("D8"),
    E1("E1"),
    E2("E2"),
    E3("E3"),
    E4("E4"),
    E5("E5"),
    E6("E6"),
    E7("E7"),
    E8("E8"),
    F1("F1"),
    F2("F2"),
    F3("F3"),
    F4("F4"),
    F5("F5"),
    F6("F6"),
    F7("F7"),
    F8("F8"),
    G1("G1"),
    G2("G2"),
    G3("G3"),
    G4("G4"),
    G5("G5"),
    G6("G6"),
    G7("G7"),
    G8("G8"),
    H1("H1"),
    H2("H2"),
    H3("H3"),
    H4("H4"),
    H5("H5"),
    H6("H6"),
    H7("H7"),
    H8("H8");

    private final char file;
    private final char rank;

    GridPosition(final String position) {
        file = position.charAt(0);
        rank = position.charAt(1);
    }

    static Map<String, GridPosition> gridPositionStrToEnum = new HashMap<>();

    static {
        gridPositionStrToEnum.put("A1", A1);
        gridPositionStrToEnum.put("A2", A2);
        gridPositionStrToEnum.put("A3", A3);
        gridPositionStrToEnum.put("A4", A4);
        gridPositionStrToEnum.put("A5", A5);
        gridPositionStrToEnum.put("A6", A6);
        gridPositionStrToEnum.put("A7", A7);
        gridPositionStrToEnum.put("A8", A8);
        gridPositionStrToEnum.put("B1", B1);
        gridPositionStrToEnum.put("B2", B2);
        gridPositionStrToEnum.put("B3", B3);
        gridPositionStrToEnum.put("B4", B4);
        gridPositionStrToEnum.put("B5", B5);
        gridPositionStrToEnum.put("B6", B6);
        gridPositionStrToEnum.put("B7", B7);
        gridPositionStrToEnum.put("B8", B8);
        gridPositionStrToEnum.put("C1", C1);
        gridPositionStrToEnum.put("C2", C2);
        gridPositionStrToEnum.put("C3", C3);
        gridPositionStrToEnum.put("C4", C4);
        gridPositionStrToEnum.put("C5", C5);
        gridPositionStrToEnum.put("C6", C6);
        gridPositionStrToEnum.put("C7", C7);
        gridPositionStrToEnum.put("C8", C8);
        gridPositionStrToEnum.put("D1", D1);
        gridPositionStrToEnum.put("D2", D2);
        gridPositionStrToEnum.put("D3", D3);
        gridPositionStrToEnum.put("D4", D4);
        gridPositionStrToEnum.put("D5", D5);
        gridPositionStrToEnum.put("D6", D6);
        gridPositionStrToEnum.put("D7", D7);
        gridPositionStrToEnum.put("D8", D8);
        gridPositionStrToEnum.put("E1", E1);
        gridPositionStrToEnum.put("E2", E2);
        gridPositionStrToEnum.put("E3", E3);
        gridPositionStrToEnum.put("E4", E4);
        gridPositionStrToEnum.put("E5", E5);
        gridPositionStrToEnum.put("E6", E6);
        gridPositionStrToEnum.put("E7", E7);
        gridPositionStrToEnum.put("E8", E8);
        gridPositionStrToEnum.put("F1", F1);
        gridPositionStrToEnum.put("F2", F2);
        gridPositionStrToEnum.put("F3", F3);
        gridPositionStrToEnum.put("F4", F4);
        gridPositionStrToEnum.put("F5", F5);
        gridPositionStrToEnum.put("F6", F6);
        gridPositionStrToEnum.put("F7", F7);
        gridPositionStrToEnum.put("F8", F8);
        gridPositionStrToEnum.put("G1", G1);
        gridPositionStrToEnum.put("G2", G2);
        gridPositionStrToEnum.put("G3", G3);
        gridPositionStrToEnum.put("G4", G4);
        gridPositionStrToEnum.put("G5", G5);
        gridPositionStrToEnum.put("G6", G6);
        gridPositionStrToEnum.put("G7", G7);
        gridPositionStrToEnum.put("G8", G8);
        gridPositionStrToEnum.put("H1", H1);
        gridPositionStrToEnum.put("H2", H2);
        gridPositionStrToEnum.put("H3", H3);
        gridPositionStrToEnum.put("H4", H4);
        gridPositionStrToEnum.put("H5", H5);
        gridPositionStrToEnum.put("H6", H6);
        gridPositionStrToEnum.put("H7", H7);
        gridPositionStrToEnum.put("H8", H8);
    }

    public static GridPosition translate(String str) {
        return gridPositionStrToEnum.get(str);
    }

    public static char getRank(GridPosition gp) {
        return gp.rank;
    }

    public static char getFile(GridPosition gp) {
        return gp.file;
    }
}
