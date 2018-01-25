public class Game {

    private ChessPiece[][]board = new ChessPiece[8][8];

    public ChessPiece[][] getBoard() {
        return board;
    }

    public void setBoard(ChessPiece[][] board) {
        this.board = board;
    }
}
