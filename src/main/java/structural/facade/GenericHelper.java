package structural.facade;

public class GenericHelper
{

    private MySqlHelper mySqlHelper = new MySqlHelper();
    private OracleHelper oracleHelper = new OracleHelper();


    void generateOracleReport(String tableName)
    {
        oracleHelper.generateOracleHTMLReport(tableName);
    }

    void generateMySqlReport(String tableName)
    {
        mySqlHelper.generateMySqlHTMLReport(tableName);
    }

    }
