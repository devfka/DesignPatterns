package behavioral.strategy;

public class Main
{
    public static void main(String[] args)
    {
        GameCenter gameCenter = new GameCenter();
        gameCenter.startGame(new Football());

        GameCenter gameCenter2 = new GameCenter();
        gameCenter2.startGame(new Basketball());
    }
}
