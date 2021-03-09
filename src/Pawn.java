public class Pawn extends ChessFigure {
    @Override
    public boolean isKnight() {
        return false;
    }

    @Override
    public boolean can(int x, int y) {
        if (isInBoard()) {
            int dx = x - getX();
            int dy = y - getY();
            int dxM = Math.abs(dx);
            return dy == 0 && dxM == 1 && dx > 0;
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
