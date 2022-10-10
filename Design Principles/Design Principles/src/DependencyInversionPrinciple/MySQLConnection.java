package DependencyInversionPrinciple;

public class MySQLConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database....");
        System.out.println("Connected");
    }
}
