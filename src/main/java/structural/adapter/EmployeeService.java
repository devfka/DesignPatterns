package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService
{
    private List<Employee> employees = new ArrayList<>();

    List<Employee> getAllEmployees()
    {
        return employees;
    }

    void addEmployee(Employee e)
    {
        this.employees.add(e);
    }

    int calculateAllSalaries()
    {
        return employees.stream().mapToInt(employee -> employee.getSalary()).sum();
    }
}
