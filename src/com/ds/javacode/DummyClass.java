package com.ds.javacode;

public class DummyClass {

    public String isVacationTime (boolean onVacation) {
        return onVacation ? "I am on vacation!" : "I am working";
    }

    public void printNumber (int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
