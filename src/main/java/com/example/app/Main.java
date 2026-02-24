package com.example.app;

/**
 * Entry point for the dummy application.
 */
public class Main {

    public static void main(String[] args) {
        int result = Calculator.add(2, 3);
        System.out.println("2 + 3 = " + result);

        UserService us = new UserService();
        us.process(null);
    }
}
