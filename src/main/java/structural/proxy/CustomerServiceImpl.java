package structural.proxy;

public class CustomerServiceImpl implements CustomerService
{
    @Override
    public void getCustomers()
    {
        System.out.println("We have 5 customers");
    }
}
