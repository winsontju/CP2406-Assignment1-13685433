import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle{

	public Car(int x, int y) {
		super(x, y);
		width=60;
		height=30;
		speed=5;
	}
	public void paintMe(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}
