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
        System.out.println(name +", your balance is: " + bradesco.getAccountBalance());

    }
    public void depositPerson(int currentMoney){
        bradesco.deposit(currentMoney);
        System.out.println(name +", you deposited: "+ bradesco.currentMoney +". Your account has: " + bradesco.accountBalance);
    }
    public void withdrawPerson(int currentMoney){
        bradesco.withdraw(currentMoney);
        System.out.println(name + ", you took: "+ bradesco.currentMoney + " from your account. Your account has: " + bradesco.accountBalance);
    }
    }






