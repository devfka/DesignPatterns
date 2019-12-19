package behavioral.observer;

public class Subscriber
{
    public String message;

    void updateMessage(String message)
    {
        this.message = message;
    }
}
