package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.gameobject.weapons.SniperRifle;

public enum BarrelType {
    PLASTIC,
    WOOD,
    METAL;


    private int maxDamage = 1

    public int getMaxDamage(){
        return maxDamage;
    }
}
