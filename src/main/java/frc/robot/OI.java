// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

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
