// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {

    public static Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_PORT);
    public static Joystick controller = new Joystick(RobotMap.CONTROLSTICK_PORT);

    //The intake wheel will spin if and only if this button is held.
    JoystickButton intakeButton = new JoystickButton(controller, RobotMap.INTAKE_BUTTON_ID);
    JoystickButton reverseButton = new JoystickButton(controller, RobotMap.REVERSE_SYSTEMS_BUTTON_ID);

    public OI(){ 
    }
}
