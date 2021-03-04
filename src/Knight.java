public class Knight extends ChessFigure {

    @Override
    public boolean can(int x, int y) {
        if (isInBoard()) {
            int dx = Math.abs( x - getX());
            int dy = Math.abs(y - getY());
            return dx * dx + dy * dy == 5;
        }
        return false;
    }

    @Override
    public boolean isKnight() {
        return true;
    }

    public Knight(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (this.getColor().equals("black")) {
            return "k";
        }
        return "K";
    }
}
