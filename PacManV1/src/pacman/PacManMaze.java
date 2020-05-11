package pacman;

import java.util.Set;
import java.util.stream.Collectors;

public abstract class PacManMaze {
    public static final char START_CHARACTER = 'O';
    private String maze;
    protected int mazeHeight;
    protected int mazeWidth;
    protected int startingPosition;
    protected int initialPelletCount;
    private Set<Character> edgeChars;

    public PacManMaze(String maze) {
        this.maze = maze;
        startingPosition = maze.indexOf(START_CHARACTER);
        mazeHeight = (int) maze.chars().filter(x -> x == '\n').count() + 1;
        mazeWidth = maze.length() / mazeHeight;
        initialPelletCount = countPellets();
        edgeChars = maze.chars()
                .filter(x -> Pellet.translate((char) x) == null &&
                             (char) x != START_CHARACTER &&
                             (char) x != '\n' && (char) x != ' ')
                .mapToObj(x -> (char) x)
                .collect(Collectors.toSet());

        edgeChars.forEach(System.out::println);
    }



    public String getMaze() {
        return maze;
    }

    private int countPellets() {
        return (int) maze.chars().filter(x -> Pellet.translate((char) x) != null).count();
    }

    private int countPellets(Pellet pellet) {
        return (int) maze.chars().filter(x -> Pellet.translate((char) x) == pellet).count();
    }

    public static final int DOT_VALUE = Pellet.pelletValue(Pellet.DOT);

    public int maxPotentialPoints() {
        int dotCount = countPellets(Pellet.DOT);
        int cherryCount = countPellets(Pellet.CHERRY);

        throw new RuntimeException("NOT IMPLEMENTED YET!!");
    }

    public String toString() {
        return maze;
    }
}
