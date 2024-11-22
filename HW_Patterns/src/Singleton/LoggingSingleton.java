package Singleton;

import java.time.LocalDate;

public class LoggingSingleton {

    private static final LoggingSingleton loggingSingleton = new LoggingSingleton();

    private LoggingSingleton() {
    }

    public static LoggingSingleton getInstance() {

        return loggingSingleton;
    }

    public String logg(Object obj, String info) {
        LocalDate localDate = LocalDate.now();
        return "Log info: " + localDate + " - " + obj.getClass().getName() + " - " + info;
    }
}
