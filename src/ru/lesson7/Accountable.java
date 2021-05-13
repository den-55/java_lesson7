package ru.lesson7;

public interface Accountable<T> {

    T getId();

    String getName();

    String setName(String name);

    Long getBalance();

    void setBalance(long balance);
}
