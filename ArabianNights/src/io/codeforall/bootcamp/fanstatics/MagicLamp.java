package io.codeforall.bootcamp.fanstatics;

public class MagicLamp {

        private int maxGenies;
        private int rub;
        private int totalRubs; //quantas vezes as lampada foi esfregada.
        private int recycledDemon; //quantas vezes o demon foi reciclado.

        public MagicLamp(int maxGenies) {
                this.maxGenies = maxGenies;
        }

        public void setRub() {
                if (rub < maxGenies) {
                        rub++;
                        System.out.println("You released a genie");
                        if(rub % 2 == 0) {
                                System.out.println("The genie is Friendly");
                        } else if (rub % 2 == 1) {
                                System.out.println("The genie is Grumpy");
                        }
                } else {
                        System.out.println("You released a demon");
                }


        }
}

