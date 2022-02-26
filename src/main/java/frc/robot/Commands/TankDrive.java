package frc.robot.Commands;

import java.lang.module.ModuleDescriptor.Requires;
import java.util.HashSet;
import java.util.Set;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.OI;
import frc.robot.Robot;

// Drives the drive train with a joystick

public class TankDrive implements Command{
  
  public TankDrive() {
  }
  
  @Override
  public void execute() {

    // double speed = OI.driveStick.getY();
    // double rotation = OI.driveStick.getThrottle();
    // if (!Robot.driveTrain.getReversed()){
    //   speed = -speed;
    // }
    // if (

    // Pass the joystick values to joystickDrive()
    if (!Robot.driveTrain.getReversed()) {
      if (!Robot.driveTrain.getSlowMode()){
        Robot.driveTrain.joystickDrive(-OI.driveStick.getY() / 2, OI.driveStick.getThrottle() / 3);
        System.out.println("slowMode and reverse are on");
      } else {
        Robot.driveTrain.joystickDrive(-OI.driveStick.getY(), OI.driveStick.getThrottle());
        System.out.println("Reverse is on");
      }
    } else {
      if(!Robot.driveTrain.getSlowMode()){
        Robot.driveTrain.joystickDrive(OI.driveStick.getY() / 2, OI.driveStick.getThrottle() / 3);
        System.out.println("slowMode is on and reverse if off");
      } else {
        Robot.driveTrain.joystickDrive(OI.driveStick.getY(), OI.driveStick.getThrottle());
        System.out.println("reverse is off");
      }
    }
  }
  
  @Override
  public boolean isFinished() {
    // Never finish
    return false;
  }

  @Override
  public Set<Subsystem> getRequirements() {
    HashSet<Subsystem> reqs = new HashSet<Subsystem>();
    reqs.add(Robot.driveTrain);
    return reqs;
  }

  
 }
    
