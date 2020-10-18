package net.dohaw.firstgame.gameobject;

import net.dohaw.firstgame.ObjectID;
import net.dohaw.firstgame.utils.Collidable;
import net.dohaw.firstgame.utils.Colorable;
import net.dohaw.firstgame.utils.Location;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class ImmovableGameObject extends Collidable {

    public ImmovableGameObject(Location location, ObjectID objectId, int width, int height) {
        super(objectId, null, location, width, height);
        this.collision_coord_additive = 10;
    }

    /*
        Ticking this just in case this gets moved somehow or after alignment of the object
     */
    @Override
    public void tick() {
        this.collisionRect = new Rectangle2D.Double(location.getX() - collision_coord_additive, location.getY() - collision_coord_additive, width + (collision_coord_additive * 2), height + (collision_coord_additive * 2));
    }

    @Override
    public void render(Graphics g) {

        Color color = Color.GRAY;

        if(this instanceof Colorable){
            color = ((Colorable)this).getColor();
        }

        g.setColor(color);
        g.fillRect(location.getX(), location.getY(), width, height);

        if(inSkeletonMode){
            g.setColor(Color.WHITE);
            g.drawRect(location.getX() - collision_coord_additive, location.getY() - collision_coord_additive, width + (collision_coord_additive * 2), height + (collision_coord_additive * 2));
        }

    }

}
