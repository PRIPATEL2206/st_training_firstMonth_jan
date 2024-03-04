package chessGame;

import java.util.ArrayList;
import java.util.List;

class Pawn extends Piece {
    public Pawn(Color color, Position position) {
        super(color, position);
    }

    @Override
    public boolean isValidMove(Position newPosition, Board board) {
        // Implementation of pawn move validation
        // ...
        return true;
    }

    @Override
    public List<Position> getValidMoves(Board board) {
        // Implementation of pawn move generation
        // ...
        return new ArrayList<>();
    }
}
