package io.codeforall.bootcamp;

public class Sandbox {

    public static void main(String[] args) {
        Oven oven1 = new Oven ("black");
        oven1.setColour("pink");

     System.out.println(oven1.colour);

        Oven oven2 = new Oven ("silver");
                oven2.setColour("silver");
        System.out.println(oven1.colour);
    }
}
