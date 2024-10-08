package io.codeforall.bootcamp.gameobject.enemy;

public interface Destroyable {

    public void hit(int bulletDamage);

    public boolean isDestroyed();
}
