package structural.adapter;

public class Main
{
    public static void main(String[] args)
    {
        Employee dev1 = new Developer();
        Employee dev2 = new Developer();
        Employee dev3 = new Developer();

        EmployeeService employeeService = new EmployeeService();
        employeeService.addEmployee(dev1);
        employeeService.addEmployee(dev2);
        employeeService.addEmployee(dev3);

        employeeService.addEmployee(new EmployeeAdapter(new Intern()));

        System.out.println(employeeService.calculateAllSalaries());
    }
}
