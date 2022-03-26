// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.Commands.Intake.StartIntake;
import frc.robot.Commands.Intake.StopIntake;
import frc.robot.Commands.Intestines.RunBeltOne;
import frc.robot.Commands.Intestines.RunBeltTwo;
import frc.robot.Commands.Intestines.StopBeltOne;
import frc.robot.Commands.Intestines.StopBeltTwo;
import frc.robot.Commands.Shooter.StartShooter;
import frc.robot.Commands.Shooter.StopShooter;
import frc.robot.Subsystem.Drivetrain;
import frc.robot.Subsystem.Intake;
import frc.robot.Subsystem.Intestines;
import frc.robot.Subsystem.Shooter;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */

 
public class Robot extends TimedRobot {
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();
  private final Timer m_timer = new Timer();

  //Subsystems
  public static Drivetrain driveTrain = new Drivetrain();
  public static Intake intake = new Intake();
  public static Intestines intestines = new Intestines();
  public static Shooter shooter = new Shooter();

  public static OI oi;

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    
    oi = new OI();

    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {}

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    m_autoSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected);
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    // Drive for 2 seconds
  // stop robot
    switch (m_autoSelected) {
      case kCustomAuto:
        // Put custom auto code here
        break;
      case kDefaultAuto:
      default:
        // Put default auto code here
        break;
    }
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
    //driveTrain.reset();
  //  m_teleopSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
   // System.out.println("TeleOp selected: " + m_teleopSelected);
   //m_timer.reset();
  // m_timer.start();  
}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    //driveTrain.joystickDrive(-OI.driveStick.getY(), OI.driveStick.getThrottle());

    CommandScheduler.getInstance().run();
    //oi.intakeButton.whileHeld(new StartIntake());
    //oi.intakeButton.whenReleased(new StopIntake());

    //Every periodic, we get the status of each button. 
    //If the button is held, run a command, otherwise run a different command.

    /*
    //Actually schedules and runs the commands.
    CommandScheduler cmdScheduler = CommandScheduler.getInstance();

    //If the intake button is held, run StartIntake, otherwise run StopIntake.
    if (oi.intakeButton.get()){
      cmdScheduler.schedule(new StartIntake());
    }
    else{
      cmdScheduler.schedule(new StopIntake());
    }

    
    //If the Belt 1 button is held, run RunBeltOne, otherwise run StopBeltOne
    if (oi.belt1Button.get()){
      cmdScheduler.schedule(new RunBeltOne());
    }
    else{
      cmdScheduler.schedule(new StopBeltOne());
    }

    //If the Belt 2 button is held, run RunBeltTwo, otherwise run StopBeltTwo
    if (oi.belt2Button.get()){
      cmdScheduler.schedule(new RunBeltTwo());
    }
    else {
      cmdScheduler.schedule(new StopBeltTwo());
    }

    //If the shooter button is held, run StartShooter, otherwise run StopShooter
    if (oi.shooterButton.get()){
      cmdScheduler.schedule(new StartShooter());
    }
    else{
      cmdScheduler.schedule(new StopShooter());
    }
    */
}

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  
  public void simulationPeriodic() {}
}
