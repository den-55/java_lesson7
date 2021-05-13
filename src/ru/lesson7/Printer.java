package ru.lesson7;

public class Printer {

    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
