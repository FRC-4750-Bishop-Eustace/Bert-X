// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Commands.TankDrive;

public class Drivetrain extends SubsystemBase {

  /** Creates a new Drivetrain. */

      //create drive
      DifferentialDrive robotDrive = null;

      MotorControllerGroup leftMotors = null;
      MotorControllerGroup rightMotors = null; 
      WPI_TalonSRX leftFront = null;
      WPI_TalonSRX rightFront = null; 
      WPI_TalonSRX leftBack = null;
      WPI_TalonSRX rightBack = null;
      
  

  public Drivetrain() { 
    System.out.println("!!! new drivetrain.");
    
    //Comment out this line to disable the drive train.
    setDefaultCommand(new TankDrive(this));
    
    // setDefaultCommand(new TankDrive());       //This code throws a nullref because there's circular constructor calls
    // System.out.println("!!! drivetrain successfully instantiated.");

    //initialize motors
    leftFront = new WPI_TalonSRX(RobotMap.LEFT_FRONT_ID);
    leftBack = new WPI_TalonSRX(RobotMap.LEFT_BACK_ID);
    rightFront = new WPI_TalonSRX(RobotMap.RIGHT_FRONT_ID);
    rightBack = new WPI_TalonSRX(RobotMap.RIGHT_BACK_ID);
    System.out.println("This works :)");

    leftMotors = new MotorControllerGroup(leftFront, leftBack);
    rightMotors = new MotorControllerGroup(rightFront, rightBack); 

    robotDrive = new DifferentialDrive(leftMotors, rightMotors);


    //inverts the right side to drive
    rightMotors.setInverted(true);
    

    // Stop "output not updated often enough" error from printing
    //robotDrive.setSafetyEnabled(false); 

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public boolean joystickDrive(double speed, double rotation){
    // System.out.println(String.format("Joystick movement with speed %s and rotation %s.", speed, rotation));

    robotDrive.arcadeDrive(.75 * cube(speed), .75 *  cube(rotation));
    //robotDriveBack.arcadeDrive(cube(speed), cube(rotation));
    return false;

  }

  public void autonomousDrive(double speed, double rotation){
    System.out.println(String.format("Auto movement with speed% and rotation%, ", speed, rotation));
    System.out.println("the front right motor is doing stuff, " + rightFront.get() );
    System.out.println("the front left motor is doing stuff, " + leftFront.get() );
    System.out.println("the back right motor is doing stuff, " + rightBack.get() );
    System.out.println("the back left motor is doing stuff, " + leftBack.get() );

    robotDrive.arcadeDrive(.6 * cube(speed), .6 *  cube(rotation));

  }


  /**
     * Brakes all motors on the drive train
     */

    
    public void brake() {
      leftFront.stopMotor();
      rightFront.stopMotor();
  }
 
  /**
     * Desensitizes the joystick values at low speeds
     */
 
  protected double cube(double value) {
    return 0.2 * Math.pow(value, 3) + (1 - 0.2) * value;

}

protected double square(double value) {
    return 0.2 * Math.pow(value, 2) + (1 - 0.2) * value;
  }
}
