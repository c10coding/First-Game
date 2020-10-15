package net.dohaw.firstgame.gameobject.background;

import net.dohaw.firstgame.GameObject;
import net.dohaw.firstgame.utils.Location;
import net.dohaw.firstgame.ObjectID;

import java.awt.*;


public class ImmovableGameObject extends GameObject {

    protected int width;
    protected int height;

    public ImmovableGameObject(Location location, ObjectID objectId, int width, int height) {
        super(objectId, null, location);
        this.width = width;
        this.height = height;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(location.getX(), location.getY(), width, height);
    }
}
