package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Random rand = new Random();
	Robot[] robots = new Robot[5];
	boolean isRacing = true;
	for (int i = 0; i < robots.length; i++) {
		
	robots[i]= new Robot();
	robots[i].setY(550);
	robots[i].setX(850-200*i);
	}
	while(isRacing) {
	for (int i = 0; i < robots.length; i++) {
		int distance = rand.nextInt(50);
		robots[i].move(distance);
		if (robots[i].getY() < 0) {
			isRacing = false;
			JOptionPane.showMessageDialog(null, "Robot "+ i + " won the Grand Prix!");
		}
	}
	}
	}
	//2. create an array of 5 robots.
             
	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	
	}
