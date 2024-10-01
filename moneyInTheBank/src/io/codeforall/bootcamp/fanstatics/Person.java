package io.codeforall.bootcamp.fanstatics;

public class Person {
    private String name;
    Bank bradesco = new Bank(0);

    public Person(String name, int accountBalance) {
        this.name = name;
        this.bradesco.accountBalance= accountBalance;
    }

    public void getName() {
        System.out.println(name);
    }

    public void getAccountBalance() {
        System.out.println(bradesco.accountBalance);

    }


    }






