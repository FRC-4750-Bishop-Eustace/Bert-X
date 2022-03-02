// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Commands.TankDrive;

public class Drivetrain implements Subsystem {


  /** Creates a new Drivetrain. */
  public Drivetrain() { 
    setDefaultCommand(new TankDrive());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void joystickDrive(double speed, double rotation){
    System.out.println(String.format("Joystick movement with speed $s and rotation %s.", speed, rotation));
  }
}
