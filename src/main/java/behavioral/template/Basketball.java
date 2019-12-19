package behavioral.template;

public class Basketball extends Game
{
    @Override void initialize()
    {
        System.out.println("Basketball game initialized");
    }


    @Override void startPlay()
    {
        System.out.println("Basketball game started");
    }


    @Override void endPlay()
    {
        System.out.println("Basketball game finished");
    }
}
