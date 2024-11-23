package Proxy;

public class DBProxy implements IDB{
    String db_url = "localhost:port/";

    DBClass dbClass = new DBClass();

    public DBProxy(DBClass dbClass) {
        this.dbClass = dbClass;
    }

    @Override
    public void connect() {
        System.out.println("Подключено к " + db_url + dbClass.getDb_name());
    }
}
