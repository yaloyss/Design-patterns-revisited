package executeAround;

import java.util.function.Consumer;

public class DataBaseConnection
{
    //init. con.
    private DataBaseConnection()
    {
        System.out.println("Connected to data base on localhost 3007");
    }

    public static void use(Consumer<DataBaseConnection> action)
    {
        DataBaseConnection connection = new DataBaseConnection();
        try {
            action.accept(connection);
        } finally {
            connection.close();
        }
    }

    private void close()
    {
        System.out.println("DataBaseConnection closed");
    }

    public DataBaseConnection queryDetails()
    {
        System.out.println("SELECT * FROM details");
        return this;
    }

    public DataBaseConnection queryStuff()
    {
        System.out.println("SELECT * FROM stuff");
        return this;
    }
}
