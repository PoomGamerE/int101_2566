package work03;

import work01.Utilitor;
import work02.Person;

public class Account {

    private static long nextNo = 100_000_000;
    private final long no;
    private Person owner;
    private double balance;

    Utilitor utilitor = new Utilitor();

    public Account(Person owner) {
        this.owner = owner;
        this.balance = 0;

        long result = utilitor.computeIsbn10(nextNo);
        while (result == 10) {
            nextNo++;
            result = utilitor.computeIsbn10(nextNo);
        }

        this.no = 10 * nextNo + result;
        nextNo++;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        utilitor.testPositive(amount);
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount) {
        utilitor.testPositive(amount);
        utilitor.testPositive(balance - amount);
        balance = balance - amount;
        return balance;
    }

    public void transfer(double amount, Account account) {
        utilitor.testPositive(amount);
        utilitor.testPositive(balance - amount);
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return String.format("Account(%d, %.2f)", no, balance);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }
}
