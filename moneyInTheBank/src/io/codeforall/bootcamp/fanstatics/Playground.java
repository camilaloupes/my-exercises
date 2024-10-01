package io.codeforall.bootcamp.fanstatics;

public class Playground {

    public static void main(String[] args) {

        Person person1 = new Person("Camila", 0);
        Person person2 = new Person("Anderson", 5);

        person1.getAccountBalance();
        System.out.println("Your balance is: " + person1.bradesco.getAccountBalance());

        person1.getName();

        person1.bradesco.deposit(100);

            System.out.println("You deposited: "+ person1.bradesco.currentMoney +"."+" Your account has: " + person1.bradesco.accountBalance);


        person1.bradesco.withdraw(5);

        System.out.println("You took: "+ person1.bradesco.currentMoney + " from your account. Your account has: " + person1.bradesco.accountBalance);

    }
  }

