package a5;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.get(0).setMovementVector(6, -1);
        boxes.add(new BouncingBox(50, 100, Color.BLUE));
        boxes.get(1).setMovementVector(1, 2);
        boxes.add(new BouncingBox(100, 300, Color.GREEN));
        boxes.get(2).setMovementVector(0, 4);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        for (int i = 0; i < boxes.size(); i++) {
        	boxes.get(i).draw(surface);
        }
        surface.drawLine(50, 50, 250, 250);
        surface.draw3DRect(30, 20, 100, 50, true);
        surface.drawArc(200, 150, 100, 100, 200, 270);
        surface.setColor(Color.BLUE);
        surface.drawOval(150, 70, 59, 100);
        
    }
} 