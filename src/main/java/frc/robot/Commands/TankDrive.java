package frc.robot.Commands;

//import java.lang.module.ModuleDescriptor.Requires;
//import java.util.HashSet;
//import java.util.Set;

//import edu.wpi.first.wpilibj.DriverStation;
//import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.Subsystem.Drivetrain;

// Drives the drive train with a joystick

public class TankDrive extends CommandBase{
  
  public TankDrive(Drivetrain dtrain) {
    System.out.println("!!! new tankdrive");
    addRequirements(dtrain);
    System.out.println("!!! tankdrive finished initializing");
  }
  
  @Override
  public void execute() {

    //System.out.println("Execute tankdrive command");

    // double speed = OI.driveStick.getY();
    // double rotation = OI.driveStick.getThrottle();
    // if (!Robot.driveTrain.getReversed()){
    //   speed = -speed;
    // }
    // if (

    // Pass the joystick values to joystickDrive()
        Robot.driveTrain.joystickDrive(-OI.driveStick.getY(), OI.driveStick.getThrottle());
  }
  
  @Override
  public boolean isFinished() {
    // System.out.println("check for isfinished");
    // Never finish
    return false;
  }

  // @Override
  // public Set<Subsystem> getRequirements() {
  //   HashSet<Subsystem> reqs = new HashSet<Subsystem>();
  //   reqs.add(Robot.driveTrain);
  //   return reqs;
  // }

  
 }
    
