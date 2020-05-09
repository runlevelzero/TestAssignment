package pacman;

public enum Pellet {
    D(1), C(4);
    private final int point;

    Pellet(int point) {
        this.point = point;
    }

    public Pellet translate(char ch) {
        Pellet p;
        switch (Character.toLowerCase(ch)) {
            case '*':
                p = D;
                break;
            case 'c':
                p = C;
                break;
            default:
                p = null;
        }
        return p;
    }

    public int pointValue(Pellet p) {
        return p.point;
    }
}
