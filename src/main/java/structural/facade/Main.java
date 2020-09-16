package structural.facade;

public class Main
{

    public static void main(String[] args)
    {
        GenericHelper genericHelper = new GenericHelper();

        genericHelper.generateOracleReport("xxxxx");
        genericHelper.generateMySqlReport("xxxx");
    }
}
