// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Commands.TankDrive;

public class Drivetrain extends SubsystemBase {

  /** Creates a new Drivetrain. */
  public Drivetrain() { 
    System.out.println("!!! new drivetrain.");
    setDefaultCommand(new TankDrive(this));
    // setDefaultCommand(new TankDrive());       //This code throws a nullref because there's circular constructor calls
    // System.out.println("!!! drivetrain successfully instantiated.");
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void joystickDrive(double speed, double rotation){
    System.out.println(String.format("Joystick movement with speed %s and rotation %s.", speed, rotation));
  }
}
