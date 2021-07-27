package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece
{
    //Super Class constructor
    public Pawn(Board board, Color color)
    {
        super(board, color);
    }

    //Methods
    @Override
    public boolean[][] possibleMoves()
    {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        if (getColor() == Color.WHITE)
        {
            //Verifying one block above
            p.setValues(position.getRow() - 1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
            {
                mat[p.getRow()][p.getColumn()] = true;
            }

            //Verifying two block above
            p.setValues(position.getRow() - 2, position.getColumn());
            Position p2 = new Position(position.getRow() - 1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0)
            {
                mat[p.getRow()][p.getColumn()] = true;
            }

            //Verifying Northwest
            p.setValues(position.getRow() - 1, position.getColumn() - 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p))
            {
                mat[p.getRow()][p.getColumn()] = true;
            }

            //Verifying Northeast
            p.setValues(position.getRow() - 1, position.getColumn() + 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p))
            {
                mat[p.getRow()][p.getColumn()] = true;
            }
        }
        else
        {
            //Verifying one block above
            p.setValues(position.getRow() + 1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
            {
                mat[p.getRow()][p.getColumn()] = true;
            }
            //Verifying two block above
            p.setValues(position.getRow() + 2, position.getColumn());
            Position p2 = new Position(position.getRow() + 1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0)
            {
                mat[p.getRow()][p.getColumn()] = true;
            }

            //Verifying Northwest
            p.setValues(position.getRow() + 1, position.getColumn() - 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p))
            {
                mat[p.getRow()][p.getColumn()] = true;
            }

            //Verifying Northeast
            p.setValues(position.getRow() + 1, position.getColumn() + 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p))
            {
                mat[p.getRow()][p.getColumn()] = true;
            }
        }

        return mat;
    }

    @Override
    public String toString()
    {
        return "P";
    }

}