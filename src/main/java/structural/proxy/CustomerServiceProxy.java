package structural.proxy;

public class CustomerServiceProxy implements CustomerService
{
    private CustomerServiceImpl customerService;
    private boolean isAdmin;

    public CustomerServiceProxy(boolean isAdmin)
    {
        this.customerService = new CustomerServiceImpl();
        this.isAdmin = isAdmin;
    }

    @Override
    public void getCustomers()
    {
        if (isAdmin)
        {
            this.customerService.getCustomers();
        }
        else
        {
            System.out.println("Authorization problem");
        }
    }
}
