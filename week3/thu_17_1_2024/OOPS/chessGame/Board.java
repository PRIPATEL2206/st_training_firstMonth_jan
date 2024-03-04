package chessGame;

class Board {
    private static final int BOARD_SIZE = 8;
    private Piece[][] pieces;

    public Board() {
        this.pieces = new Piece[BOARD_SIZE][BOARD_SIZE];
    }

    public Piece getPieceAt(Position position) {
        return pieces[position.getRow()][position.getCol()];
    }

    public void setPieceAt(Position position, Piece piece) {
        pieces[position.getRow()][position.getCol()] = piece;
    }

    public boolean isPositionOccupied(Position position) {
        return getPieceAt(position) != null;
    }

    public boolean isMoveValid(Position start, Position end, Player currentPlayer) {
        // Implementation of move validation based on chess rules
        // ...
        return true;
    }

    public boolean isCaptureValid(Position start, Position end, Player currentPlayer) {
        // Implementation of capture validation based on chess rules
        // ...
        return true;
    }
}
