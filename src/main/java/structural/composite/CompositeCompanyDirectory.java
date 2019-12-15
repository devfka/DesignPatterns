package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCompanyDirectory implements Employee
{
    private List<Employee> employees = new ArrayList<>();


    @Override
    public void showEmployeeDetails()
    {
        employees.forEach(Employee::showEmployeeDetails);
    }


    public void addEmployee(Employee emp)
    {
        employees.add(emp);
    }


    public void removeEmployee(Employee emp)
    {
        employees.remove(emp);
    }
}
