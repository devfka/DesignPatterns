package structural.adapter;

public class Intern implements OutSourceEmployee
{
    @Override
    public int getDailyCost()
    {
        return 2;
    }

}
