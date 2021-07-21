package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece
{
    private Color color;

    //Custom constructor (With arguments)
    public ChessPiece(Board board, Color color)
    {
        super(board);
        this.color = color;
    }

    //Getters and Setters
    public Color getColor()
    {
        return color;
    }
}
