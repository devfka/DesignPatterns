package structural.proxy;

public class Main
{
    public static void main(String[] args)
    {
        CustomerService customerService = new CustomerServiceProxy(true);
        customerService.getCustomers();

        CustomerService customerService2 = new CustomerServiceProxy(false);
        customerService2.getCustomers();

    }
}
