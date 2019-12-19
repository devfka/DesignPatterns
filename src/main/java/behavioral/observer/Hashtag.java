package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Hashtag implements Subject
{
    private List<Subscriber> observers;
    private String message;
    private boolean changed;

    public Hashtag()
    {
        this.observers = new ArrayList<>();
    }

    @Override public void register(Subscriber obj)
    {
        observers.add(obj);
    }

    @Override public void unregister(Subscriber obj)
    {
        observers.remove(obj);
    }


    @Override public void notifyObservers()
    {
        for (Subscriber observer : observers)
        {
            observer.updateMessage(this.message);
        }
    }

    @Override public void publishMessage(String message)
    {
        this.message = message;
        notifyObservers();
    }
}
