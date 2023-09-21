/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author Poom Suthipong
 */
public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    
    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    
    public double withdraw(double amount){
        balance = balance - amount;
        return balance;
    }
    
    public void transfer(double amount, BankAccount account){
        balance = balance - amount;
        account.balance = account.balance + amount;
    }
    
    @Override
    public String toString(){
        return "BankAccount(" + owner.getId() + ")";
    }
}
