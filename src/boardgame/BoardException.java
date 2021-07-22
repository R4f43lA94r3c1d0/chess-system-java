package boardgame;

public class BoardException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    //Message constructor
    public BoardException (String msg)
    {
        super(msg);
    }
}
