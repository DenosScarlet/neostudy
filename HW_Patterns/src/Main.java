import Singleton.LoggingSingleton;
import Singleton.TestClass;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        String info = "Some info";
        LoggingSingleton loggingSingleton = LoggingSingleton.getInstance();

        System.out.println(loggingSingleton.logg(testClass, info));
    }
}