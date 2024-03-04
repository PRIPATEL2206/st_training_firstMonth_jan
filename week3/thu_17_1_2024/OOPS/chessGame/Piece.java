package chessGame;

import java.util.List;

abstract class Piece {
    private Color color;
    private Position position;

    public Piece(Color color, Position position) {
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract boolean isValidMove(Position newPosition, Board board);

    public abstract List<Position> getValidMoves(Board board);
}
