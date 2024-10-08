package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.gameobject.enemy.*;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;

    public static Destroyable Enemies() {

        return Math.random() > 0.5 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);

        }

    }

}
