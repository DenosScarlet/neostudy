import Adapter.SDCard;
import Adapter.PC;
import Adapter.USBAdapter;
import Adapter.USBCable;
import Factory.CoffeType;
import Factory.CoffeeGrinder;
import Factory.Facility;
import Proxy.DBClass;
import Proxy.DBProxy;
import Singleton.LoggingSingleton;
import Singleton.TestClass;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        String info = "Some info";
        LoggingSingleton loggingSingleton = LoggingSingleton.getInstance();

        System.out.println(loggingSingleton.logg(testClass, info) + '\n');

        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        Facility facility = new Facility(coffeeGrinder);
        facility.start(CoffeType.AMERICANO);
        System.out.println();

        USBCable usbCable = new USBCable();
        PC pc = new PC();
        pc.setConnection(usbCable);
        System.out.println();

        SDCard sdCard = new SDCard();
        USBAdapter usbAdapter = new USBAdapter(sdCard);
        PC pc2 = new PC();
        pc2.setConnection(usbAdapter);
        System.out.println();

        DBClass dbClass = new DBClass();
        DBProxy dbProxy = new DBProxy(dbClass);
        dbProxy.connect();

    }
}