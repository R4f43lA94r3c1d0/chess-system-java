package chess;

public class ChessException extends RuntimeException
{
    public static final long serialVersionUID = 1L;

    //Message constructor
    public ChessException (String msg)
    {
        super(msg);
    }

}
