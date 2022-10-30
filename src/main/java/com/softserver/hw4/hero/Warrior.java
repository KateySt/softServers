package com.softserver.hw4.hero;

import com.softserver.hw4.Mortal;
import com.softserver.hw4.enemy.Enemy;

public class Warrior extends Hero implements Mortal {

    Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 25;

        if (health != 0) {
            System.out.println("Warrior attack enemy");
            if (damage > enemy.getHealth()) {
                System.out.println(enemy.getHealth());
                enemy.takeDamage(enemy.getHealth());
                System.out.println("Dead enemy");
            } else
                enemy.takeDamage(damage);
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
