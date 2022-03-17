// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


public class RobotMap {
  /** Creates a new RobotMap. */
  public RobotMap() {}

  //Joystick ports (usb)
  public static final int DRIVESTICK_PORT = 0;
  public static final int CONTROLSTICK_PORT = 1;

    //Drivetrain motors ID (CAN IDs)
    public static final int LEFT_FRONT_ID = 14;
    public static final int LEFT_BACK_ID = 15;
    public static final int RIGHT_FRONT_ID = 2;
    public static final int RIGHT_BACK_ID = 1;
    
    //Intake motor ID
    public static final int INTAKE_MOTOR_ID = 15;

    //Joystick Button IDs
    public static final int INTAKE_BUTTON_ID = 8;
    public static final int REVERSE_SYSTEMS_BUTTON_ID = 2;

}
