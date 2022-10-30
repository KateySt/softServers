package com.softserver.hw4.enemy;


import com.softserver.hw4.Mortal;
import com.softserver.hw4.hero.Hero;

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

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
        int damage = 15;

        if (health != 0) {
            System.out.println("Enemy attack hero");
            if (damage > hero.getHealth()) {
                System.out.println(hero.getHealth());
                hero.takeDamage(hero.getHealth());
                System.out.println("Dead hero");
            } else
                hero.takeDamage(damage);
        } else
            System.out.println("Enemy is dead");
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
