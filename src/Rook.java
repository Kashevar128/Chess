public class Rook extends ChessFigure {

    @Override
    public boolean isKnight() {
        return false;
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (this.getColor().equals("black")) {
            return "r";
        }
        return "R";

    }

    @Override
    public boolean can(int x, int y) {
        int dx = Math.abs(x - getX());
        int dy = Math.abs(y - getY());
        if (isInBoard()) {
            return (dy == 0 && dx != 0) || (dx == 0 && dy != 0);
        }
        return false;
    }
}
