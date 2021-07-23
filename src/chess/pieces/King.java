package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece
{
    //Super Class constructor
    public King(Board board, Color color)
    {
        super(board, color);
    }

    //Methods

    @Override
    public String toString()
    {
        return "K";
    }

    private boolean canMove (Position position)
    {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves()
    {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //Verifying above
        p.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verifying below
        p.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verifying left
        p.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verifying right
        p.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verifying Northwest
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verifying Northeast
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verifying Southwest
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verifying Southeast
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p))
        {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}

