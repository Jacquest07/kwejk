package pl.akademiakodu.kwejk;

/**
 * Created by Eriot on 2017-09-05.
 */
public class ErrorMessage
{
    private String message;

    public ErrorMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "ErrorMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
