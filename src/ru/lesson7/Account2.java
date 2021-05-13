package ru.lesson7;

public class Account2<I, B> {  //<T, K, ...>
    private I id;
    private B balance;

    public Account2(I id, B balance) {
        this.id = id;
        this.balance = balance;
    }

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    public B getBalance() {
        return balance;
    }

    public void setBalance(B balance) {
        this.balance = balance;
    }
}
