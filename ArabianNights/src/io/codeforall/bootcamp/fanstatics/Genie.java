package io.codeforall.bootcamp.fanstatics;

public class Genie {

    private int maxWishes;
    private int grantedWishes;


    public Genie(int maxWishes){
        this.maxWishes= maxWishes;

    }
    public void grantWish(){
        if (grantedWishes < maxWishes){
            grantedWishes++;
        }



    }


}
