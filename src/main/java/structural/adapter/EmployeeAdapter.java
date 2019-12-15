package structural.adapter;

public class EmployeeAdapter implements Employee
{
    private OutSourceEmployee outSourceEmployee;


    public EmployeeAdapter(OutSourceEmployee outSourceEmployee)
    {
        super();
        this.outSourceEmployee = outSourceEmployee;
    }


    @Override public void getDepartment()
    {

    }


    @Override public int getYearsOfExperience()
    {
        return 0;
    }


    @Override public int getSalary()
    {
        return outSourceEmployee.getDailyCost();
    }
}
