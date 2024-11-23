package Proxy;

public class DBClass implements IDB {
    private final String db_name = "clients";

    public String getDb_name() {
        return db_name;
    }

    @Override
    public void connect() {
        System.out.println("Подключено к " + getDb_name());
    }
}
