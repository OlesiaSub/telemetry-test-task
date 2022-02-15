package ru.hse.second;

import ru.hse.first.FirstHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SecondMainClass {
    private static final Logger logger = Logger.getLogger(SecondMainClass.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Launching main method of class SecondMainClass...");
        System.out.println("Hello, second world!");
        FirstHelper helper = new FirstHelper();
        helper.doSomething();
    }
}
