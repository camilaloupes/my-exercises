package io.codeforall.bootcamp;

public class Oven {

    public String colour;


    public Oven(String changeColour) {

        this.colour = changeColour;

    }

    public void setColour(String someColour) {

        if (someColour.equals("black") || someColour.equals("silver")) {
            this.colour = someColour;

            System.out.println("This oven is " + someColour);
        } else {
            System.out.println("The oven is only available in black or silver");
        }
    }
}


