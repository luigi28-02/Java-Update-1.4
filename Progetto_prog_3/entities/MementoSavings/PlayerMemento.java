package Progetto_prog_3.entities.MementoSavings;

import Progetto_prog_3.entities.Players.Players;

public class PlayerMemento extends Memento {

    private float attackBoxX, attackBoxY;
    private float hitBoxX, hitBoxY;
    private int currentHealth;

    public PlayerMemento(Players players){


        hitBoxX = (float) players.getHitbox().getX();
        hitBoxY = (float) players.getHitbox().getY();
        
        attackBoxX = (float) players.getHitbox().getX();
        attackBoxY = (float) players.getHitbox().getY();

        this.currentHealth = players.getCurrentHealth();
    }

    public int getCurrentHealth(){
        return currentHealth;
    }

    @Override
    public float getHitboxY() {
        return hitBoxY;
    }
    
    @Override
    public float getHitboxX() {
        return hitBoxX;
    }

    @Override
    public float getAttackBoxX() {
        return attackBoxX;
    }

    @Override
    public float getAttackBoxY() {
        return attackBoxY;
    }
    
}
