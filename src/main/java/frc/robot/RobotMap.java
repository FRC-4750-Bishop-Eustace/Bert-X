// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


public class RobotMap {
  /** Creates a new RobotMap. */
  
  //Joystick ports (DriveStation ID)
  public static final int DRIVESTICK_PORT = 0;
  public static final int CONTROLSTICK_PORT = 1;

    //Drivetrain motors ID (Cans)
    public static final int LEFT_FRONT_ID = 14;
    public static final int LEFT_BACK_ID = 15;
    public static final int RIGHT_FRONT_ID = 2;
    public static final int RIGHT_BACK_ID = 1;
    
    //Intake motor ID
    public static final int INTAKE_MOTOR_ID = 8;
    
    //Shooter head motors
    public static final int SHOOTER_1_MOTOR_ID = 15;
    public static final int SHOOTER_2_MOTOR_ID = 14;
    
    //Belt motor IDs
    public static final int BELT_1_MOTOR_ID = 11;
    public static final int BELT_2_MOTOR_ID = 13;


    //Joystick Button IDs
    public static final int INTAKE_BUTTON_ID = 5;
    public static final int SHOOTER_HEAD_BUTTON_ID = 0;
    public static final int BELT_1_BUTTON_ID = 1;
    public static final int BELT_2_BUTTON_ID = -1;

    // public static final int REVERSE_SYSTEMS_BUTTON_ID = 2;

}
