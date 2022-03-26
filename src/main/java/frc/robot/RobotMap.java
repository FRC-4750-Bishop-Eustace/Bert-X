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
    public static final int LEFT_FRONT_ID = 3;
    public static final int LEFT_BACK_ID = 2;
    public static final int RIGHT_FRONT_ID = 1;
    public static final int RIGHT_BACK_ID = 0;
    
    //Intake motor ID
    public static final int INTAKE_MOTOR_ID = 12;
    
    //Shooter head motors
    public static final int SHOOTER_1_MOTOR_ID = 15;
    public static final int SHOOTER_2_MOTOR_ID = 14;
    
    //Belt motor IDs
    public static final int BELT_1_MOTOR_ID = 11;
    public static final int BELT_2_MOTOR_ID = 13;


    //Joystick Button IDs
    public static final int INTAKE_BUTTON_ID = 7; // lt
    public static final int SHOOTER_HEAD_BUTTON_ID = 8; //rt
    public static final int BELT_1_BUTTON_ID = 4; // y
    public static final int BELT_2_BUTTON_ID = 3; // b
    // reverse buttons
    public static final int REVERSE_INTAKE_BUTTON_ID = 9; // BACK
    public static final int REVERSE_SHOOTER_HEAD_BUTTON_ID = 10; // START
    public static final int REVERSE_BELT_1_BUTTON_ID = 1; // x
    public static final int REVERSE_BELT_2_BUTTON_ID = 2; // a  


    // public static final int REVERSE_SYSTEMS_BUTTON_ID = 2;

}
