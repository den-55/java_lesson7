package ru.lesson7;

public class Account3 {  //<T, K, ...>
    private String id;
    private long balance;

    <T> Account3(T id, long balance) {
        this.id = id.toString();
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
