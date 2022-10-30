package com.softserver.hw4.hero;

import com.softserver.hw4.Mortal;
import com.softserver.hw4.enemy.Enemy;

public abstract class Hero {
    private final String name;
    protected int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void takeDamage(int damage);
}
