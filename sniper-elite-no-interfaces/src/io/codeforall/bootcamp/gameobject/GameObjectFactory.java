package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.gameobject.enemy.*;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;

    public static Enemy createEnemies(){

        return Math.random() > 0.5 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);

        }
        public static Barrel createBarrels() {


            int random = (int) (Math.random() * BarrelType.values().length);
            Barrel barrel =new Barrel(barrelType)
            switch (barrelType) {
                case WOOD -> new Barrel(BarrelType.WOOD);
                case METAL -> new Barrel(BarrelType.METAL);
                case PLASTIC -> new Barrel(BarrelType.PLASTIC);

            }
        }

}
