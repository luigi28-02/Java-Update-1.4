package Progetto_prog_3.entities.Players;

import Progetto_prog_3.entities.Entity;
import Progetto_prog_3.entities.MementoSavings.PlayerMemento;

import java.awt.*;

public abstract class Players extends Entity
{
    public Players(float x, float y, int hitBoxWidth, int hitBoxHeight) {
        super(x, y, hitBoxWidth, hitBoxHeight);
    }

    protected abstract void initStates();
    protected abstract void initAttackBoxes();
    public abstract void update();
    protected abstract void updatePosition();
    protected abstract void updateAnimationTick();
    protected abstract void updateAttackBox();
    public abstract void render(Graphics g, int xLevelOffset, int yLevelOffset);
    public abstract void drowAttackBox(Graphics g, int levelOffsetX, int yLevelOffset);
    protected abstract void drawUI(Graphics g);
    protected abstract void updateHealthBar();
    protected abstract void updatePowerBar();
    protected abstract void checkAttack();
    public abstract void ultimateAbility();
    public abstract void dash();
    protected abstract void checkPotionTouched();
    protected abstract void checkSpikesTouched();
    protected abstract void setAnimation();
    protected abstract void resetAnimationTick();
    //protected abstract void updatePostion();
    protected abstract void updateXPos(float xSpeed);
    public abstract void changeHealth(int value);
    public abstract void changePower(int value);
    public abstract void resetAll();
    public abstract void restoreState(PlayerMemento playerMemento);
    protected abstract void loadAnimations();
    public abstract void loadLevelData(int [][] levelData);
    public abstract void resetMovement();
    public abstract void setSpawnPoint(Point spawn);
    protected abstract  void jump();
    protected abstract  void resetInAir();
    public abstract  void die();
    public abstract int getPlayerTileY();


    public abstract void setUp(boolean b);

    public abstract void setLeft(boolean b);

    public abstract void setDown(boolean b);

    public abstract void setRight(boolean b);

    public abstract void setJump(boolean b);

    public abstract void setAttck(boolean b);

    public abstract void setCanPlayAtacksooound(boolean b);

    public abstract int getDamage();
}
