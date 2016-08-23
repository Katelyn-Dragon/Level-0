import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot Chappie = new Robot("vic");
	Chappie.sparkle();
	Chappie.setPenColor(Color.GREEN);
	Chappie.setPenWidth(10);
	Chappie.penDown();
	Chappie.setSpeed(10);
	Chappie.move(400);
	Chappie.turn(180);
	Chappie.move(200);
	Chappie.turn(-30);
	Chappie.move(240);
	Chappie.turn(180);
	Chappie.move(240);
	Chappie.turn(65);
	Chappie.move(250);
	Chappie.penUp();
	Chappie.turn(60);
	Chappie.move(100);
	Chappie.turn(85);
	Chappie.setPenColor(Color.CYAN);
	Chappie.setPenWidth(10);
	Chappie.penDown();
	Chappie.move(400);
	Chappie.turn(-90);
	Chappie.move(200);
	Chappie.turn(-20);
	Chappie.move(50);
	Chappie.turn();
}
}
