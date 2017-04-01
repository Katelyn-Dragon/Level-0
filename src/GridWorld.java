import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World world = new World();
	int r = new Random().nextInt(10);
	int d = new Random().nextInt(10);
	int k = new Random().nextInt(10);
	int e = new Random().nextInt(10);
	int g = new Random().nextInt(10);
	int j = new Random().nextInt(10);
	int c = new Random().nextInt(10);
	Location location = new Location(r,d);
	Location location1 = new Location(j,k);
	Location location2 = new Location(g,e);
	Location location3 = new Location(j,d);
	Location location4 = new Location(e,c);
	Actor Bug = new Actor();
	Actor Flower = new Actor();
	Bug b = new Bug();
	Flower f = new Flower();
	b.setColor(Color.CYAN);
	b.setDirection(45);
	f.setColor(Color.GREEN);
	world.show();
	world.add(location1 , f);
	world.add(location , b);
	world.add(location2 , b);
	world.add(location3 , f);
	world.add(location4 , f);
	}
}