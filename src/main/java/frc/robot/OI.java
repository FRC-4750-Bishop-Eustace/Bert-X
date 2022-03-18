// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//Intake Logic
/**

For the intake of a ball we have a motor(IntakeMotorOne) that takes the ball to the next motor(BeltOne) and into the robot. When the ball is on BeltOne 
there is a sensor(sensor2) that senses if a ball is on BeltOne and will tell us through code. The ball moves into the next motor(BeltTwo). Just like BeltOne, a 
sensor(Sensor2) that tells us if it senses a ball on BeltTwo. For shooting, there is two motors(ShooterHead) that will run and fire the ball. 

For describing the logic, there will be four possible senarios:

senario 1: There are 0 balls
senario 2: There is 1 ball, but on sensor 1
senario 3: There is 1 ball, but on sensor 2
senario 4: There is 2 balls

All of these senarios will be based on if the sensors detect a ball or not

IF THE SHOOTER HEAD IS NOT PRESSED:

senario 1: We will run all the motors so when we get a ball, the ball will go to senor 2 and stop.
-Intake = 1
-Belt1 = 1
-Belt2 = 1

-senor 1 = 0
-senor 2 = 0

senario 2: We will run all the motors again so we can move the ball we already have up to senor 2, and open up senor 1 for another ball.
-Intake = 1
-Belt1 = 1
-Belt2 = 1

-senor 1 = 1
-senor 2 = 0

senario 3: We will only run the intake and belt1 to keep the ball we have in at senor 2 and take in a new ball.
-Intake = 0 
-Belt1 =  0
-Belt2 = 1

-senor 1 = 0
-senor 2 = 1

senario 4: if we are full of balls then no motor
-Intake = 0
-Belt1 = 0
-Belt2 = 0

-senor 1 = 0
-senor 2 = 0

If shooter head button is pressed:

1: 
-Intake = 1
-Belt1 = 1
-Belt2 = 1
-shooterhead = 1

-senor 1 = 0
-senor 2 = 0

2:
-Intake = 0
-Belt1 = 1
-Belt2 = 1
-shooterhead = 0

-senor 1 = 1
-senor 2 = 0

3:
-Intake = 0
-Belt1 = 0
-Belt2 = 1
-shooterhead = 1

-senor 1 = 0
-senor 2 = 1

4:
-Intake = 0
-Belt1 = 1
-Belt2 = 1
-shooterhead = 1

-senor 1 = 1
-senor 2 = 1
*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import edu.wpi.first.wpilibj2.command.InstantCommand;

/** Add your docs here. */
public class OI {

        //Joysticks
        public static Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_PORT);
        //public static Joystick controller = new Joystick(RobotMap.CONTROLSTICK_PORT);
 
        //Joystick buttons
        public static JoystickButton driveMode = new JoystickButton(driveStick, 2);

    public OI(){
        
    }
}
