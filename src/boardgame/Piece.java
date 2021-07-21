package boardgame;

public class Piece
{
    protected Position position;
    private Board board;

    //Standard constructor
    public Piece (){}

    //Custom constructor (With arguments)
    public Piece(Board board)
    {
        this.board = board;
        position = null;
    }

    //Getter
    protected Board getBoard()
    {
        return board;
    }
}
