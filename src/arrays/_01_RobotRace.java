package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robs = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = robs.length-1; i >= 0; i--) {
			robs[i] = new Robot();
			robs[i].moveTo(i * 60, 600);
			robs[i].setSpeed(100);
		}
boolean isRunning = true;
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		while(isRunning)
		{
		for (int i = 4; i >= 0; i--) {
			robs[i].move(rand.nextInt(50));
			if(robs[i].getY()<50)
			{
				isRunning = false;
				
			}
		}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		boolean run = true;
JOptionPane.showMessageDialog(null, "Robot is winner");
		// 8. try different races with different amounts of robots.
Robot[] r = new Robot[3];
for(int i = r.length-1;i>=0;i--)
{
r[i] = new Robot();
robs[i].moveTo(i * 60, 600);
robs[i].setSpeed(100);
}
while(run)
{
for(int i = r.length-1;i>=0;i--)
{
r[i].move(rand.nextInt(50));	
r[i].turn(90);
if(r[i].getX() >300&r[i].getY() >400)
{
run = false;	
}
}
}

		// 9. make the robots race around a circular track.
	}
}
