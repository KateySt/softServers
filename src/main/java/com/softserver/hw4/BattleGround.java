package com.softserver.hw4;

import com.softserver.hw4.enemy.Enemy;
import com.softserver.hw4.enemy.Zombie;
import com.softserver.hw4.hero.Archer;

public class BattleGround {
    public static void main(String[] args) {
        Zombie enemy = new Zombie(100);

        Archer archer = new Archer("JoJo");
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        enemy.resurrection();
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        System.out.println(enemy.getHealth());

    }
}
