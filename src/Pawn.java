public class Pawn extends ChessFigure {
    @Override
    public boolean isKnight() {
        return false;
    }

    @Override
    public boolean can(int x, int y) {
        if (isInBoard()) {
            int dx = Math.abs( x - getX());
            int dy = Math.abs(y - getY());
            return dy == 0 && dx == 1 && x - getX() > 0;
        }
        return false;
    }

    public Pawn(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (this.getColor().equals("black")) {
            return "p";
        }
        return "P";
    }
}
