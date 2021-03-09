public class King extends ChessFigure {
    @Override
    public boolean isKnight() {
        return false;
    }

    @Override
    public boolean can(int x, int y) {
        if (isInBoard()) {
            int dx = x - getX();
            int dy = y - getY();
            return (dy == 0 && dx == 1) || (dx == 0 && dy == 1) || (dx == 1 && dy == 1);
        }
        return false;
    }

    public King(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (this.getColor().equals("black")) {
            return "kg";
        }
        return "Kg";
    }
}
