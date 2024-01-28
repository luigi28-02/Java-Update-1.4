package Progetto_prog_3.entities.RenderChain;

import java.awt.Graphics;

import Progetto_prog_3.entities.Players.Players;
import Progetto_prog_3.entities.enemies.AbstractEnemy;

public interface RenderInterface {

    public void setNextHandler(RenderInterface nextHandler);
    public void renderEntity(Graphics g, Players players, RenderingRequest[] requests, AbstractEnemy ab, int xLevelOffset, int yLevelOffset);

}
