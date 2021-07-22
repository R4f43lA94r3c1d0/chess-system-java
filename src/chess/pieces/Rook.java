package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece
{
    //Super Class constructor
    public Rook(Board board, Color color)
    {
        super(board, color);
    }

    //Methods

    @Override
    public String toString()
    {
        return "R";
    }
}
