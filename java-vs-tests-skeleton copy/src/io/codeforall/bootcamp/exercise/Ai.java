package io.codeforall.bootcamp.exercise;

public class Ai {

    public static String creationDate;
    public static String name;

    public Ai(String creationDate, String name) {
        this.creationDate = creationDate;
        this.name = name;

        System.out.println(Ai.creationDate + Ai.name);

    }

    public static String getCreationDate() {
        return Ai.creationDate;

    }

    public static String getName() {
        return Ai.name;
    }

    public void setCreationDate(String newCreationDate) {
        this.creationDate = newCreationDate;

    }

    public void setName(String newName) {
        this.name = newName;

    }

    public int[] doubleArray(int[] integerArray) {

        int[] doubleArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            doubleArray[i] = integerArray[i] * 2;
        }
        return doubleArray;
    }

    public static int getFactorialIterative(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        } else {
            System.out.println("the number has to be positive");
            return result;
        }
    }

    private boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public String palindromeReplace(String str) {
        str = str.toLowerCase();


    }

}




