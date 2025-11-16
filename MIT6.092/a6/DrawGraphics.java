package a6;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<MovingObject> movers = new ArrayList<MovingObject>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        Arc box2 = new Arc(40, 35, 14, 360, Color.ORANGE);
        Rectangle straightBox1 = new Rectangle(35, 10, Color.RED);
        Arc straightBox2 = new Arc(70, 70, 0, 150, Color.CYAN);
        
        movers.add(new MovingObject(100, 170, box1, true));
        movers.add(new MovingObject(90, 250, box2, true));    
        movers.add(new MovingObject(130, 50, straightBox1, false));
        movers.add(new MovingObject(130, 50, straightBox2, false));
        
        movers.get(0).setMovementVector(3, 1);
        movers.get(1).setMovementVector(2, 5);
        movers.get(2).setMovementVector(6, -2);
        movers.get(3).setMovementVector(1, 3);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (MovingObject object : movers)
        	object.draw(surface);
    }
}
