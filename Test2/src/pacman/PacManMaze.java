package pacman;

public abstract class PacManMaze {
    public static final char START_CHARACTER = 'O';
    private String maze;
    private int startingPosition;

    public PacManMaze(String maze) {
        this.maze = maze;
        int itr = 0;
        boolean foundStart = false;
        while (itr < maze.length() && !foundStart) {
            char ch_i = maze.charAt(itr);
            foundStart = ch_i == START_CHARACTER;
            if (foundStart) {
                startingPosition = itr;
            } else {
                itr += 1;
            }
        }
//        int count = 0;
//        for (int i = 0; i < maze.length(); i++) {
//            if (maze.charAt(i) == '*') {
//                count += 1;
//            }
//        }
//        System.out.println(String.format("%s pellets to start", (count)));
    }

    public int getPelletsLeft() {
        throw new RuntimeException("NOT YET IMPLEMENTED!!");
    }

    public String toString() {
        return maze;
    }
}
