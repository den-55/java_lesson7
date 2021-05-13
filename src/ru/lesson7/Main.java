package ru.lesson7;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Account<Integer> account = new Account(12345, "Счёт 1", 1000);
        int id = account.getId();
        System.out.println(id);

        Account<String> account2 = new Account("dfdsfdf-56g", "Счёт 2", 1000);
        System.out.println(account2.getId());*/

        /*Accountable<String> accountable = new Account("dsfdsffg45", "dqwerty", 100L);
        Accountable<Integer> accountable2 = new Account(125478, "dqwerty", 100L);
        Account<String> account = new Account("dfdhyyt344", "qwertyu", 150L);
        System.out.println(accountable2.getId());
        System.out.println(account.getId());*/

        /*String[] strings = {"a", "b", "c", "d"};
        Integer[] integers = {1, 5, 55, 66, 22};

        Printer printer = new Printer();
        printer.print(strings);
        printer.print(integers);*/

        /*Account2<Integer, Double> account = new Account2<>(1, 1365465.02);
        Double balance = account.getBalance();
        Integer id = account.getId();

        System.out.println(id + " " + balance);

        Account3 account3 = new Account3("sdfsdf3", 111);
        Account3 account32 = new Account3(654644, 111);
        Account3 account33 = new Account3(new Animal(), 111);
        System.out.println(account3);
        System.out.println(account32);
        System.out.println(account33);*/

        Account4 account4 = new Account4("1", 1000);
        Account4 account41 = new Account4("1", 500);

        Transaction<Account4> transaction = new Transaction<>(account4, account41, 200);

        transaction.execute();







    }
}
