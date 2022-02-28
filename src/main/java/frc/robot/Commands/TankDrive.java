package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

// Drives the drive train with a joystick

public class TankDrive extends Command [
  
  public TankDrive() {
    // Require the drive train or wont work
    requires(Robot.driveTrain);
  }
  
  @Override
  protected void execute() {
    // Pass the joystick values to joystickDrive()
    // if the drivetrain is in reverese and in slowmode, the robot will get the joystick input and sensitivity and will tell the person driving that
    // the robot is in reverse and slowmode
    if (!Robot.driveTrain.reversed()) {
      if (!Robot.driveTrain.slowMode()){
      Robot.driveTrain.joystickDrive(-OI.driveStick.getY() / 2, OI.driveStick.getThrottle() / 3);
      System.out.println("slowMode and reverse are on");
      } else {
        // This is the same thing as above except the robot is only in reverse and not in slowmode.
        Robot.driveTrain.joystickDrive(-OI.driveStick.getY(), OI.driveStick.getThrottle());
        System.out.println("Reverse is on");
      }
    } else {
      if(!Robot.driveTrain.slowMode()){
      Robot.driveTrain.joystickDrive(OI.driveStick.getY() / 2, OI.driveStick.getThrottle() / 3);
     // System.out.println("slowMode is on and reverse if off");
      } else {
        Robot.driveTrain.joystickDrive(OI.driveStick.getY(), OI.driveStick.getThrottle());
       // System.out.println("reverse is off");
      }
    }
  }
  
  @Override
  protected boolean isFinished() {
    // Never finish
    return false;
  }
  
 }
    
