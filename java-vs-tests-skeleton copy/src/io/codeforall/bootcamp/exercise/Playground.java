package io.codeforall.bootcamp.exercise;

public class Playground {
    public static void main(String[] args) {

        Ai firstTest = new Ai("28/09/2024", " Camila");

        System.out.println(Ai.getCreationDate());
        System.out.println(Ai.getName());

        Ai ai = new Ai("", "");
        ai.setCreationDate("30/09/2024");
        System.out.println(ai.getCreationDate());


        ai.setName("Camilinha");
        System.out.println(ai.getName());

        int[] array = new int[]{1, 2, 3, 4};
        array = ai.doubleArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println(Ai.getFactorialIterative(-3));

    }
}
