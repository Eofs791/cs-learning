package a6;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Arc implements Sprite{
	private int width;
	private int height;
	private int startAngle;
	private int arcAngle;
	private Color color;
	
	
	public Arc(int x, int y, int start, int arc, Color color) {
		this.width = x;
		this.height = y;
		this.startAngle = start;
		this.arcAngle = arc;
		this.color = color;
	}
	
	public void draw(Graphics surface, int x, int y) {
		surface.setColor(color);
		surface.fillArc(x, y, width, height, startAngle, arcAngle);
		surface.setColor(Color.BLACK);
		((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
		surface.drawArc(x, y, width, height, startAngle, arcAngle);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getStartAngle() {
		return startAngle;
	}
	
	public int getArcAngle() {
		return arcAngle;
	}
}
