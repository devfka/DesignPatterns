package structural.adapter;

public class Manager implements Employee
{
    @Override public void getDepartment()
    {

    }

    @Override public int getYearsOfExperience()
    {
        return 0;
    }

    @Override public int getSalary()
    {
        return 2;
    }
}
