package com.softserver.hw4.hero;

import com.softserver.hw4.enemy.Enemy;

abstract class Hero {
    private final String name;

    Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);
}
