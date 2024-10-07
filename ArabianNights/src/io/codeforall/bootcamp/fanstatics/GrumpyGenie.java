package io.codeforall.bootcamp.fanstatics;

public class GrumpyGenie extends Genie{

    public GrumpyGenie(){
        super(3);

    }

    @Override
    public void grantWish() {

        if (grantedWishes == 1){
            super.grantWish();
            System.out.println("your wish was granted");
        }
        System.out.println("You don't have more wishes");



    }

}
