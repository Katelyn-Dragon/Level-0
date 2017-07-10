import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.setY(430);
		Tortoise.setX(10);
		for (int i = 0; i < args.length; i++) {
			Tortoise.setSpeed(5);
			Tortoise.setPenColor(Color.LIGHT_GRAY);
			Tortoise.move(100);
			Tortoise.turn(45);
			Tortoise.move(20);
			Tortoise.turn(90);
			Tortoise.move(20);
			Tortoise.turn(45);
			Tortoise.move(100);
			Tortoise.setPenColor(Color.GREEN);
			Tortoise.turn(-90);
			Tortoise.move(30);
			Tortoise.turn(-90);
		}
	}
}
