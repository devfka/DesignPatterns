package behavioral.memento;

public class Main
{
    public static void main(String[] args)
    {
        Game game = new Game("time1", "content1");
        GameMemento gameMemento = game.save();
        System.out.println(game.toString());

        game.setTime("time2");
        game.setContent("content2");
        System.out.println(game.toString());

        game.loadLastSave(gameMemento);
        System.out.println(game.toString());

    }
}
