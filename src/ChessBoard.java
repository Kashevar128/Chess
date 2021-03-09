import java.util.Arrays;

public class ChessBoard {
    private ChessFigure [][] board;
    public ChessBoard() {
        board = new ChessFigure[8][8];

        board[0][0] = new Rook(0, 0, "white");
        board[0][7] = new Rook(0, 7, "white");
        board[7][0] = new Rook(7, 0, "black");
        board[7][7] = new Rook(7, 7, "black");
        board[0][1] = new Knight(0, 1, "white");
        board[0][6] = new Knight(0, 6, "white");
        board[7][1] = new Knight(7, 1, "black");
        board[7][6] = new Knight(7, 6, "black");
        board[0][2] = new Bishop(0, 2, "white");
        board[0][5] = new Bishop(0, 5, "white");
        board[7][2] = new Bishop(7, 2, "black");
        board[7][5] = new Bishop(7, 5, "black");
        board[1][0]  = new Pawn(1, 0, "white");
        board[1][1]  = new Pawn(1, 1, "white");
        board[1][2]  = new Pawn(1, 2, "white");
        board[1][3]  = new Pawn(1, 3, "white");
        board[1][4]  = new Pawn(1, 4, "white");
        board[1][5]  = new Pawn(1, 5, "white");
        board[1][6]  = new Pawn(1, 6, "white");
        board[1][7]  = new Pawn(1, 7, "white");
        board[6][0]  = new Pawn(6, 0, "black");
        board[6][1]  = new Pawn(6, 1, "black");
        board[6][2]  = new Pawn(6, 2, "black");
        board[6][3]  = new Pawn(6, 3, "black");
        board[6][4]  = new Pawn(6, 4, "black");
        board[6][5]  = new Pawn(6, 5, "black");
        board[6][6]  = new Pawn(6, 6, "black");
        board[6][7]  = new Pawn(6, 7, "black");
        board[0][3] = new Queen(0, 3, "white");
        board[7][3] = new Queen(7, 3, "black");
        board[0][4] = new King(0, 4, "white");
        board[7][4] = new King(7, 4, "black");
    }

    protected boolean isInBoard(int x, int y) {
        return x >= 0 && y >= 0 && x < 8 && y < 8;
    }

    public void moveOrEat(int x1, int y1, int x2, int y2) {
        if (isInBoard(x1, y1) && board[x1][y1] != null &&
                board[x1][y1].can(x2, y2)) {
            ChessFigure figure = board[x1][y1];
            board[x2][y2] = figure;
            figure.setXY(x2, y2);
            board[x1][y1] = null;
        } else System.out.println("Невозможно сделать ход " + x2 + " " + y2);
    }

    public boolean pathIsClear (int x1, int y1, int x2, int y2) {
        int dxM = Math.abs(x2 - x1);
        int dyM = Math.abs(y2 - y1);
        int xMin, yMin, xMax, yMax;
        if(dxM == dyM) {

            xMin = Math.min(x1, x2);
            xMax = Math.max(x1, x2);

            yMin = Math.min(y1, y2);
            yMax = Math.max(y1, y2);

            for (int i = xMin; i < xMax; i++) {
                for (int j = yMin++; j <= yMax; j++) {
                    
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s =new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    s.append(" _");
                } else {
                    s.append(" " + board[i][j]);
                }
            }
            s.append('\n');
        }
        return s.toString();
    }
}
