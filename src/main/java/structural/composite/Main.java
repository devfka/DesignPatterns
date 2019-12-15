package structural.composite;

public class Main
{
    public static void main(String[] args)
    {
        CompositeCompanyDirectory compositeCompanyDirectory = new CompositeCompanyDirectory();
        Developer developer = new Developer(1, "test 1", "");
        Developer developer2 = new Developer(2, "test 2", "");
        Manager manager = new Manager(3, "test 3", "");
        Manager manager2 = new Manager(4, "test 3", "");

        compositeCompanyDirectory.addEmployee(developer);
        compositeCompanyDirectory.addEmployee(developer2);
        compositeCompanyDirectory.addEmployee(manager);
        compositeCompanyDirectory.addEmployee(manager2);

        compositeCompanyDirectory.showEmployeeDetails();
    }
}
