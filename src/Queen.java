public class Queen extends ChessFigure {
    @Override
    public boolean isKnight() {
        return false;
    }

    @Override
    public boolean can(int x, int y) {
        int dx = x - getX();
        int dy = y - getY();
        if (isInBoard()) {
            return (dy == 0 && dx != 0) || (dx == 0 && dy != 0) || (dx == dy);
        }
        return false;
    }

    public Queen(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (this.getColor().equals("black")) {
            return "q";
        }
        return "Q";
    }
}
