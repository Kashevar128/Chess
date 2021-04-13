public class Knight extends ChessFigure {

    @Override
    public boolean can(int x, int y) {
        if (isInBoard()) {
            int dx = x - getX();
            int dy = y - getY();
            return dx * dx + dy * dy == 5;
        }
        return false;
    }

    @Override
    public boolean isKnight() {
        return true;
    }

    @Override
    public boolean isPawn() {
        return false;
    }

    @Override
    public boolean isKing() {
        return false;
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
