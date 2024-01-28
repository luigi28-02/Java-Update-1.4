package Progetto_prog_3.GameStates;

import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import Progetto_prog_3.Game;
import Progetto_prog_3.Audio.AudioPlayer;
import Progetto_prog_3.UI.MenuButton;
import Progetto_prog_3.utils.LoadSave;

public abstract class State {
    
    protected Game game;
    protected BufferedImage backgroundImage, actualBackgroundImage;
    protected int menuX, menuY, menuWidth, menuHeight;

    public State(Game game){
        this.game = game;
    }

    public boolean buttonHovered(MouseEvent e, MenuButton mb){
        return mb.getHitbox().contains(e.getX(), e.getY());
    }

    public Game getGame(){
        return this.game;
    }

    public void setGameState(GameState state){
        switch (state) {
            case MENU -> game.getAudioPlayer().playSong(AudioPlayer.MENU_MUSIC);
            case PLAYING -> game.getAudioPlayer().playSong(1);
            
        }
        
        GameState.state = state;
    }

    public void setPlaying_Choose(GameState.Player_Choose player)
    {
        GameState.Player_Choose.player_choose=player;
    }


    //Alcuni metodi comuni agli stati
    protected void loadBackground() {
        backgroundImage = LoadSave.getSpriteAtlas(LoadSave.MENU_BACKGROUND);
        menuWidth = (int)(backgroundImage.getWidth() * Game.SCALE);
        menuHeight = (int)(backgroundImage.getHeight() * Game.SCALE);
        menuX = Game.GAME_WIDTH / 2 - menuWidth / 2;
        menuY = (int) (45 * Game.SCALE);
    }
}

