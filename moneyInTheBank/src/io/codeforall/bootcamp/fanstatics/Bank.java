package io.codeforall.bootcamp.fanstatics;

public class Bank {

    public int accountBalance;
    public int currentMoney;

    public Bank(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;

    }

    public void deposit(int money) {
        if (money < 0) {
            System.out.println("This is fake money!");
            return;
        }
        currentMoney = money;
        accountBalance += money;

    }

    public void withdraw(int money) {
        if (money > accountBalance) {
            System.out.println("You don't have this amount in your account");
            return;
        }
        if (money < 0) {
            System.out.println("This is fake money!");
            return;
        }
        currentMoney = money;
        accountBalance -= money;

    }
}
