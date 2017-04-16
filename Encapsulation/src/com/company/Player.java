package com.company;

/**
 * Created by Asab on 4/14/2017.
 */
public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for player
        }
    }

    public  int healthRemaining(){
        return this.health;

    }
}
