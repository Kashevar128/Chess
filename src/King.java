public class King extends ChessFigure {
    @Override
    public boolean isKnight() {
        return false;
    }

    @Override
    public boolean isPawn() {
        return false;
    }

    @Override
    public boolean isKing() {
        return true;
    }

    @Override
    public boolean can(int x, int y) {
        if (isInBoard()) {
            int dx = x - getX();
            int dy = y - getY();
            int dxM = Math.abs(dx);
            int dyM = Math.abs(dy);
            return (dyM == 0 && dxM == 1) || (dxM == 0 && dyM == 1) || (dxM == 1 && dyM == 1);
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
