package com.softserver.hw4.hero;

import com.softserver.hw4.Mortal;
import com.softserver.hw4.enemy.Enemy;

public class Archer extends Hero implements Mortal {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 15;

        if (health != 0) {
            System.out.println("Archer attack enemy");
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
        super.health -= (damage * 1.3);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
