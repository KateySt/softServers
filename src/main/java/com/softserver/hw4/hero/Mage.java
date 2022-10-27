package com.softserver.hw4.hero;

import com.softserver.hw4.enemy.Enemy;

public class Mage extends Hero {
    Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 10;

        System.out.println("Mage attack enemy");

        if (damage > enemy.getHealth()) {
            System.out.println(enemy.getHealth());
            enemy.takeDamage(enemy.getHealth());
            System.out.println("Dead enemy");
        } else
            enemy.takeDamage(damage);
    }
}
