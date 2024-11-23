import Factory.CoffeType;
import Factory.CoffeeGrinder;
import Factory.Facility;
import Singleton.LoggingSingleton;
import Singleton.TestClass;

public class Main {
    public static void main(String[] args) {
        /*TestClass testClass = new TestClass();
        String info = "Some info";
        LoggingSingleton loggingSingleton = LoggingSingleton.getInstance();

        System.out.println(loggingSingleton.logg(testClass, info));*/
        
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        Facility facility = new Facility(coffeeGrinder);
        facility.start(CoffeType.AMERICANO);

    }
}