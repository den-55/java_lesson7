package ru.lesson7;

public class Dog extends Animal {
    private String c;

    public Dog(int a, int b, String c) {
        super(a, b);
        this.c = c;
    }

    public Dog(int a, int b) {
        super(a, b);
    }

    public void gav() {
        System.out.println("gav");
    }
}
