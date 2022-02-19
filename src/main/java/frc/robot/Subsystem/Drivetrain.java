// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

    //create motors
    public WPI_TalonSRX leftFront, leftBack, rightFront, rightBack;
    //create drive
    DifferentialDrive robotDrive = null;
    MotorControllerGroup leftMotors = null;
    MotorControllerGroup rightMotors = null; 

  public Drivetrain() {
    //initialize motors
    leftFront = new WPI_TalonSRX(RobotMap.LEFT_FRONT_ID);
    leftBack = new WPI_TalonSRX(RobotMap.LEFT_BACK_ID);
    rightFront = new WPI_TalonSRX(RobotMap.RIGHT_FRONT_ID);
    rightBack = new WPI_TalonSRX(RobotMap.RIGHT_BACK_ID);

    leftMotors = new MotorControllerGroup(leftFront, leftBack);
    rightMotors = new MotorControllerGroup(rightFront, rightBack); 

    robotDrive = new DifferentialDrive(leftMotors, rightMotors);

  }
    
  public void JoystickDrive(double moveSpeed, double rotateSpeed){
    robotDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
