package pacman;

public abstract class PacManMaze {
    protected char[][] maze;
    private final int[] mazeDimensions;
    private final int initialPelletCount;

    public PacManMaze(char[][] maze) {
        this.maze = maze;
        mazeDimensions = new int[]{maze[0].length, maze.length,};
        initialPelletCount = countPellets();
    }

    public int[] getMazeDimensions() {
        return mazeDimensions;
    }

    public int getInitialPelletCount() {
        return initialPelletCount;
    }

    private int countPellets() {
        return countPellets(null);
    }

    private int countPellets(Pellet pellet) {
        int count = 0;
        for (int row = 0; row < mazeDimensions[0]; row++) {
            char[] currentRow = maze[row];
            for (int col = 0; col < mazeDimensions[1]; col++) {
                if (Pellet.translate(currentRow[col]) != pellet) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static final int DOT_VALUE = Pellet.pelletValue(Pellet.DOT);

    public int maxPotentialPoints() {
        int dotCount = countPellets(Pellet.DOT);
        int cherryCount = countPellets(Pellet.CHERRY);

        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < mazeDimensions[0]; row++) {
            String rowAsString = new String(maze[row]);
            sb.append(rowAsString).append('\n');
        }

        return sb.toString().trim();
    }
}
