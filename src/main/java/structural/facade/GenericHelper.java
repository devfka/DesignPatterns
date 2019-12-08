package structural.facade;

public class GenericHelper
{
    public static void generateReport(String dbType, String tableName)
    {
        if (dbType.equals("MySql"))
        {
            MySqlHelper mySqlHelper = new MySqlHelper();
            mySqlHelper.generateMySqlHTMLReport(tableName);
        }
        else if (dbType.equals("Oracle"))
        {
            OracleHelper oracleHelper = new OracleHelper();
            oracleHelper.generateOracleHTMLReport(tableName);
        }

    }
}
