package ru.hse.first;

import ru.hse.Helper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FirstMainClass {
    private static final Logger logger = Logger.getLogger(FirstMainClass.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Launching main method of class FirstMainClass...");
        System.out.println("Hello, first world!");
        Helper helper = new Helper();
        helper.doSomething();
    }
}