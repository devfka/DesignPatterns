package behavioral.observer;

public class Main
{
    public static void main(String[] args)
    {
        Subscriber subscriber = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        Subscriber subscriber3 = new Subscriber();

        Hashtag hashtag = new Hashtag();

        hashtag.register(subscriber);
        hashtag.register(subscriber2);
        hashtag.register(subscriber3);

        hashtag.publishMessage("Welcome to the message board");

        System.out.println(subscriber.message);
        System.out.println(subscriber2.message);
        System.out.println(subscriber3.message);
    }
}
