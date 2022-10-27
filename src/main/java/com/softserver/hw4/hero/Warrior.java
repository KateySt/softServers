package com.softserver.hw4.hero;

import com.softserver.hw4.enemy.Enemy;

public class Warrior extends Hero {

    Warrior(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 25;

        System.out.println("Warrior attack enemy");

        if (damage > enemy.getHealth()) {
            System.out.println(enemy.getHealth());
            enemy.takeDamage(enemy.getHealth());
            System.out.println("Dead enemy");
        } else
            enemy.takeDamage(damage);
    }
}
