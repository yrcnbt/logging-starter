package ru.danilenkoya.loggingstarter;

public class LoggingStarterAutoConfiguration {
    public static void println(String message) {
        System.out.println("Gradle, " + message);
    }
}
