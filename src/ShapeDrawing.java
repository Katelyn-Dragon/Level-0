import org.teachingextensions.logo.Tortoise;

public class ShapeDrawing {
public static void main(String[] args) {
	Tortoise.setSpeed(10);
	Tortoise.penUp();
	Tortoise.turn(-150);
	Tortoise.move(180);
	Tortoise.turn(150);
	
	Tortoise.penDown();
	for (int i = 0; i < 4; i++) {
		
	
	Tortoise.move(200);
	Tortoise.turn(90);
	}
	Tortoise.turn(60);
	Tortoise.move(100);
	Tortoise.turn(-60);
	for (int i = 0; i < 4; i++) {
		
	
	Tortoise.move(200);
	Tortoise.turn(90);
}
	Tortoise.penUp();
	Tortoise.move(150);
	Tortoise.turn(-90);
	Tortoise.move(86);
	Tortoise.turn(150);
	Tortoise.penDown();
	Tortoise.move(100);
	Tortoise.turn(10);
}
}
