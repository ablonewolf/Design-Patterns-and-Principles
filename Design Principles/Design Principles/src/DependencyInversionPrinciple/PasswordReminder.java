package DependencyInversionPrinciple;

public class PasswordReminder {
    private DBConnection dbConnection;

    public PasswordReminder(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    public void connect() {
        this.dbConnection.connect();
    }
}
