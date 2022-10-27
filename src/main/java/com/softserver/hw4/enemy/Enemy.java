package com.softserver.hw4.enemy;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int takeDamage(int damage) {
        health -= damage;
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
