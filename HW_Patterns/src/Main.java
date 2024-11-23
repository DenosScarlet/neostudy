import Adapter.SDCard;
import Adapter.PC;
import Adapter.USBAdapter;
import Adapter.USBCable;

public class Main {
    public static void main(String[] args) {
        /*TestClass testClass = new TestClass();
        String info = "Some info";
        LoggingSingleton loggingSingleton = LoggingSingleton.getInstance();

        System.out.println(loggingSingleton.logg(testClass, info));*/

        /*CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        Facility facility = new Facility(coffeeGrinder);
        facility.start(CoffeType.AMERICANO);*/

        USBCable usbCable = new USBCable();
        PC pc = new PC();
        pc.setConnection(usbCable);

        SDCard sdCard = new SDCard();
        USBAdapter usbAdapter = new USBAdapter(sdCard);
        PC pc2 = new PC();
        pc2.setConnection(usbAdapter);

    }
}