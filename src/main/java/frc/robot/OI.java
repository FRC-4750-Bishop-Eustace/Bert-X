// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {

    public static Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_PORT);

    JoystickButton toggleDirection = new JoystickButton(driveStick, 3);
    JoystickButton slowDriveMode = new JoystickButton(driveStick, 2);
    public OI(){

    }
}
