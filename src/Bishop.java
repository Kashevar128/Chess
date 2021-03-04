public class Bishop extends ChessFigure {

    @Override
    public boolean isKnight() {
        return false;
    }

    @Override
    public boolean can(int x, int y) {
        int dx = Math.abs(x - getX());
        int dy = Math.abs(y - getY());
        if (isInBoard()) return sum * sum == dx * dx + dy * dy;
        else return false;
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (this.getColor().equals("black")) {
            return "b";
        }
        return "B";
    }
}
