package net.dohaw.firstgame.scenes;

import net.dohaw.firstgame.Game;
import net.dohaw.firstgame.gameobject.BlankBackground;

import java.awt.*;

public class StartingMenu extends Scene{

    public StartingMenu(Game game) {
        super(game);
    }

    @Override
    public void init() {
        BlankBackground background = new BlankBackground(game);
        background.setColor(Color.BLACK);
        objects.add(background);
        handler.addObjects(this);
    }

}
