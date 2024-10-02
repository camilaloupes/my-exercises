package io.codeforall.bootcamp.fanstatics;

public class RecyclableDemon extends Genie{

    public int wish;
    public RecyclableDemon(){
        super(3);

    }

    @Override
    public void grantWish() {

        if (wish > 0){
            super.grantWish();
            System.out.println("your wish was granted");
        }




    }
}
