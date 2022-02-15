package ru.hse;

import ru.hse.first.FirstMainClass;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OuterMainClass {
    private static final Logger logger = Logger.getLogger(FirstMainClass.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Launching main method of class OuterMainClass...");
        System.out.println("Hello, world!");
    }
}
