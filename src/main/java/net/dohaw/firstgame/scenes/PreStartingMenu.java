package net.dohaw.firstgame.scenes;

import net.dohaw.firstgame.Game;
import net.dohaw.firstgame.ObjectID;
import net.dohaw.firstgame.gameobject.FPSCounter;
import net.dohaw.firstgame.gameobject.sprites.SpriteBuilder;
import net.dohaw.firstgame.gameobject.text.TextObject;
import net.dohaw.firstgame.gameobject.sprites.MoveableSprite;
import net.dohaw.firstgame.utils.Alignment;
import net.dohaw.firstgame.utils.Location;
import net.dohaw.firstgame.utils.Vector;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PreStartingMenu extends Scene implements MouseListener {

    public PreStartingMenu(Game game){
        super(game);
        game.addMouseListener(this);
    }

    @Override
    public void init() {

        MoveableSprite backgroundMoveableSprite = new SpriteBuilder(game, "src/main/resources/premenu background.png")
            .setHeight(Game.HEIGHT - 25)
            .setWidth(Game.WIDTH)
            .setIsAnimated(false)
            .setLocation(new Location(0, 0))
            .setVector(new Vector(0, 0))
            .setObjectID(ObjectID.BACKGROUND)
            .create();
        objects.add(backgroundMoveableSprite);

        TextObject gameTxt = new TextObject(game, new Location(0, 100), new Font("Roboto", Font.PLAIN, 40), "Game", Color.BLACK);
        gameTxt.alignText(game.getGraphics(), Alignment.HORIZONTAL_CENTER);
        objects.add(gameTxt);

        TextObject clickToContTxt = new TextObject(game, new Location(0, (int) (Game.HEIGHT * .75)), new Font("Roboto", Font.BOLD, 20), "Press anywhere to continue...", Color.BLACK);
        clickToContTxt.alignText(game.getGraphics(), Alignment.HORIZONTAL_CENTER);

        objects.add(clickToContTxt);
        objects.add(new FPSCounter(game));

        handler.addObjects(this);
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        game.clearCanvas();
        goToNextScene(new TestingGrounds(game));
        game.removeMouseListener(this);

    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) { }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }

}
