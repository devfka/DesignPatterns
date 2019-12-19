package behavioral.template;

public class Main
{
    public static void main(String[] args)
    {
        Game game = new Basketball();
        Game game1 = new Football();

        game.play();
        game1.play();
    }
}
