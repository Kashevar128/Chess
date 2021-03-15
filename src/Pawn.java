public class Pawn extends ChessFigure {

    private int countUsage = 0;

    @Override
    public boolean isKnight() {
        return false;
    }

    @Override
    public boolean isPawn() {
        return true;
    }

    @Override
    public boolean can(int x, int y) {
        countUsage++;
        int dx = x - getX();
        int dy = y - getY();
        int dxM = Math.abs(dx);
        int dyM = Math.abs(dy);
        if (isInBoard() && dx > 0) {
            if(countUsage == 1 && dxM == 2) return dy == 0 && x > getX();
             return (dy == 0 && dxM == 1 && x > getX()) ||  dxM == dyM && x > getX();
        }
        if (isInBoard() && dx < 0) {
            if(countUsage == 1 && dxM == 2) return dy == 0 && getX() > x;
            return (dy == 0 && dxM == 1 && getX() > x) || dxM == dyM && getX() > x;
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
