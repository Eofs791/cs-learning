package a6;
import java.awt.Graphics;

public class MovingObject {
	private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;
    private boolean bouncer;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public MovingObject(int startX, int startY, Sprite sprite, boolean bouncer) {
        x = startX;
        y = startY;
        this.sprite = sprite; 
        this.bouncer = bouncer;
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the sprite
        sprite.draw(surface, x, y);

        // Move the object each time we draw it
        x += xDirection;
        y += yDirection;

        if (bouncer) {
            // If we have hit the edge and are moving in the wrong direction, reverse direction
            // We check the direction because if a box is placed near the wall, we would get "stuck"
            // rather than moving in the right direction
            if ((x <= 0 && xDirection < 0) ||
                    (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
                xDirection = -xDirection;
            }
            if ((y <= 0 && yDirection < 0) ||
                    (y + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
                yDirection = -yDirection;
            }
        }
    }
}
