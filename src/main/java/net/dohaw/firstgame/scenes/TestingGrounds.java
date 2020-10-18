package net.dohaw.firstgame.scenes;

import net.dohaw.firstgame.Game;
import net.dohaw.firstgame.ObjectID;
import net.dohaw.firstgame.gameobject.BlankBackground;
import net.dohaw.firstgame.gameobject.ImmovableGameObject;
import net.dohaw.firstgame.gameobject.Player;
import net.dohaw.firstgame.utils.Alignment;
import net.dohaw.firstgame.utils.Location;
import net.dohaw.firstgame.utils.Vector;

import java.awt.*;
import java.awt.event.MouseEvent;

public class TestingGrounds extends Scene{

    public TestingGrounds(Game game) {
        super(game);
    }

    @Override
    public void init() {

        BlankBackground background = new BlankBackground();
        background.setColor(Color.BLACK);
        objects.add(background);

        ImmovableGameObject ground = new ImmovableGameObject(new Location(0, 100), ObjectID.BACKGROUND, 300, 100);
        ground.setInSkeletonMode(true);
        ground.alignRelative(Alignment.BOTTOM, 0, 0);
        ground.align(Alignment.HORIZONTAL_CENTER);
        objects.add(ground);

        ImmovableGameObject wall = new ImmovableGameObject(new Location(170, 300), ObjectID.BACKGROUND, 50, 50);
        wall.setInSkeletonMode(true);
        //wall.setRelative(background);
        //wall.alignRelative(Alignment.RELATIVE_RIGHT, 0, 0);
        objects.add(wall);

        Player player = new Player(new Vector(0, 0), new Location(0, 0), 30, 30);
        player.initPhysics(this);
        player.align(Alignment.CENTER);
        player.setInSkeletonMode(true);
        player.setCollision_coord_additive(1);

        game.addKeyListener(player);
        game.addMouseListener(player);
        objects.add(player);

        objects.add(game.getFpsCounter());

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

    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

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
