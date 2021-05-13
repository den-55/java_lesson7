package ru.lesson7;

public class Account<T> implements Accountable<T> {  //<T, K, ...>
    private T id;
    private String name;
    private long balance;

    public Account(T id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    @Override
    public T getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public Long getBalance() {
        return balance;
    }

    @Override
    public void setBalance(long balance) {

    }
}
