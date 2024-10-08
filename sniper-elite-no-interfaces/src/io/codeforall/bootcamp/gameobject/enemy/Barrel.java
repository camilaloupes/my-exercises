package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.gameobject.GameObject;

public class Barrel extends GameObject implements Destroyable {

    public BarrelType barrelType;
    private int currentDamage;
    public boolean destroyed;

    public Barrel(BarrelType barrelType){
        this.barrelType = barrelType;
        int random = (int)(Math.random()*BarrelType.values().length);

                switch(barrelType){
                    case WOOD -> System.out.println("Wood Barrel");
                    case METAL -> System.out.println("Metal Barrel");
                    case PLASTIC -> System.out.println("Plastic Barrel");
    }}


    @Override
    public String getMessage() {
        return "This is a barrel";
    }

    @Override
    public void hit(int bulletDamage) {
        barrelType.setMaxDamage(barrelType.getMaxDamage() - currentDamage);
        }


    @Override
    public boolean isDestroyed() {
        return false;
    }
}
