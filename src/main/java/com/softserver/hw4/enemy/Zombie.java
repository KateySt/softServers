package com.softserver.hw4.enemy;

public class Zombie extends Enemy{
    public Zombie(int health) {
        super(health);
    }
    public void resurrection(){
        super.setHealth(50);
    }
}
