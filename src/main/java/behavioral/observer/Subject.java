package behavioral.observer;

public interface Subject
{
    //methods to register and unregister observers
    public void register(Subscriber obj);
    public void unregister(Subscriber obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public void publishMessage(String message);
}
