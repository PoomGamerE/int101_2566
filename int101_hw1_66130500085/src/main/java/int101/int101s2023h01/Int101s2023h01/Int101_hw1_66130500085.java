/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package int101.int101s2023h01.Int101s2023h01;

import work03.MyUtil;
import work04.BankAccount;
import work04.Person;

/**
 *
 * @author mcinl
 */
public class Int101_hw1_66130500085 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();
    }

    static void work01Question(boolean b1, boolean b2, boolean b3,
            boolean b4, boolean b5, boolean b6) {
        // do nothing in this method; do your work in work01Question()
        boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6);
        System.out.println("Work01:Question: b = " + b);
    }

    static void work01Answer(boolean b1, boolean b2, boolean b3,
            boolean b4, boolean b5, boolean b6) {
        // remove () as many as possible from the following expression
        // but do not change the meaning of the expression; 
        // regardless of the values of the parameters: b1-b6 .
        boolean b = b1 ^ (b2 | b3) && b4 || b5 & b6;
        System.out.println("Work01:Answer: b = " + b);
    }

    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
        // do nothing in this method; do your work in work02Question()
        boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6));
        System.out.println("Work02:Question: b = " + b);
    }

    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
        // remove () as many as possible from the following expression
        // but do not change the meaning of the expression; 
        // regardless of the values of the parameters: b1-b6 .
        boolean b = v1 << v2 < v3 != v3 > ((v4 ^ v5) | v6);
        System.out.println("Work02: Question: b = " + b);
    }

    static void work03UseOfUtilityClass() {
        /*
      3.1 Create a utility class named "MyUtil" in package named "work03".
      3.2 Create a method named "calculateBMI" in "MyUtil" class. 
          This method receives two parameters of type "double" 
          named "weight" and "height" and it returns a "double" 
          which is the result of "weight" divided by "height"^2. //complete
      3.3 Create a method named "average" in "MyUtil" class.
          This method receives three parameters of type "int" named
          "v1", "v2", "v3" and it returns a "double" which is 
          the average values of the three parameters.
      3.4 Show in this "work03UseOfUtilityClass" method how to use 
          "calculateBMI" and "average" methods of "MyUtil" class.
         */
        System.out.println("BMI = " + MyUtil.calculateBMI(45.1, 167));
        System.out.println("Average = " + MyUtil.average(4, 8, 16));
    }

    static void work04UseOfObjectClass() {
        /*
      4.1 Create a public class named "Person" in package named "work04".
          This class contains the following field and methods.
          4.1.1 a private "id" field of type "int".
          4.1.2 a public constructor that receives 
                an "id" parameter to set the "id" field.
          4.1.3 public getter/setter methods.
          4.1.4 @Override a public "toString" method that 
                returns a "String" of value "Person(id)" 
                where "id" is the "id" field.
      4.2 Create a public class named "BankAccount" in package named "work04".
          This class contains the following field and methods.
          4.2.1 a private "number" field of type "int".
          4.2.1 a private "owner" field of type "Person".
          4.2.2 a private "balance" field of type "double".
          4.2.3 a public constructor that receives a "number" parameter and
                an "owner" parameter to set the "number" and "owner" fields.
          4.2.4 public getter methods for "owner" and "balance" fields.
          4.2.5 a public "deposit" method that receives an "amount" 
                parameter of type "double" and returns a "double". 
                This method adds the "amount" to the "balance" to set
                the new value of the "balance" and returns this new value.
          4.2.6 a public "withdraw" method that receives an "amount"
                parameter of type "double" and returns a "double".
                This method substracts the "amount" to the "balance" to set
                the new value of the "balance" and returns this new value.
          4.2.7 a public "transfer" method that receives an "amount" 
                parameter of type "double" and an "account" parameter of 
                type "BankAccount". This method "withdraws" the "amount" 
                from the "balance" of this object and "deposits" 
                the "amount" to the "balance" of the "account" object 
                (in the parameter). This methods returns nothing.
          4.2.8 @Override a public "toString" method that 
                returns a "String" of value "BankAccount(id,)" 
                where "id" is the "id" field.
      4.3 Show in this "work04UseOfObjectClass" method how to use 
          each method of "Person" and "BankAccount" objects.
         */
        Person boss = new Person(101);
        Person member = new Person(102);
        System.out.println("boss id = " + boss.getId());
        System.out.println("member id = " + member.getId());
        member.setId(112); //change member id
        System.out.println(member.toString());

        BankAccount theboss = new BankAccount(1, boss);
        BankAccount themember = new BankAccount(2, member);
        System.out.println("boss balance = " + theboss.getBalance());
        System.out.println("member balance = " + themember.getBalance());
        
        theboss.deposit(1000);
        System.out.println("boss balance = " + theboss.getBalance());
        
        theboss.withdraw(100);
        System.out.println("boss balance = " + theboss.getBalance());
        
        theboss.transfer(500, themember);
        System.out.println("boss balance = " + theboss.getBalance());
        System.out.println("member balance = " + themember.getBalance());
    }
}
