package io.codeforall.bootcamp.fanstatics;

public class Playground {

    public static void main(String[] args) {

        Person person1 = new Person("Camila", 0 );
        Person person2 = new Person("Anderson", 0);

        person1.getAccountBalance();

        person1.getName();

        person1.depositPerson(1);

        person1.withdrawPerson(5);

        person2.getAccountBalance();



    }
  }

