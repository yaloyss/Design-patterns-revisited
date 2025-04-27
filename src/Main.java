import executeAround.*;
public class Main {
    public static void main(String[] args)
    {
        DataBaseConnection.use(connection -> connection.queryDetails().queryStuff());
    }
}