package ru.lesson7;

public class Transaction<T extends Account4> {
    private T from;
    private T to;
    private int sum;

    public Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {

        if(from.getBalance() > sum) {
            from.setBalance(from.getBalance() - sum);
            to.setBalance(to.getBalance() + sum);
            System.out.printf("Account %s: %d \n" +
                    "Account %s: %d \n" + from.getId(), from.getBalance(), to.getId(), to.getBalance());
        }else{
            System.err.println("Invalid operation");
        }
    }
}
