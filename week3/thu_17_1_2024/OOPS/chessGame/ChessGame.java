package chessGame;



public class ChessGame {
    public static void main(String[] args) {
        // Create a chess game
        Game chessGame = new Game();

        chessGame.makeMove(new Position(1, 0), new Position(3, 0));
        chessGame.makeMove(new Position(6, 1), new Position(4, 1));
        chessGame.makeMove(new Position(0, 4), new Position(4, 0));
    }
}

