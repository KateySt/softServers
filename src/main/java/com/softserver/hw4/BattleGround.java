package com.softserver.hw4;

import com.softserver.hw4.enemy.Enemy;
import com.softserver.hw4.enemy.Zombie;
import com.softserver.hw4.hero.Archer;

public class BattleGround {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(100);
        Enemy enemy = new Enemy(50);

        Archer archer = new Archer("JoJo",100);
        archer.attackEnemy(zombie);
        zombie.attackHero(archer);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        zombie.resurrection();
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        System.out.println(zombie.getHealth());
        System.out.println(enemy.getHealth());
        System.out.println(archer.getHealth());
        zombie.attackHero(archer);

    }
}
