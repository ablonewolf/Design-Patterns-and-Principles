package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        DBConnection connection = new MySQLConnection();
        PasswordReminder reminder = new PasswordReminder(connection);
        reminder.connect();
    }
}
