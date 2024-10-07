package io.codeforall.bootcamp.fanstatics;

public class FriendlyGenie extends Genie{

    public int wish;
    public FriendlyGenie(){
        super(3);

    }

    @Override
    public void grantWish() {

        if (wish <= 3){
            super.grantWish();
            System.out.println("your wish was granted");
        }
        System.out.println("You don't have more wishes");



    }
}
