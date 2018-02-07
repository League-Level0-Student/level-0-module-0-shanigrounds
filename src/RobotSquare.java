/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot meow = new Robot();

        // 3. Put the robot's pen down
meow.penDown();

        // 6. Make the robot move as fast as possible
meow.setSpeed(1000);

        // 5. Do everything below here 4 times
for(int x = 0; x < 4; x++) {

        //         2. Move your robot 200 pixels
meow.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
meow.turn(90);

    }
}
}