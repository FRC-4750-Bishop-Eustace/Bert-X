// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.Subsystem.Drivetrain;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the
 * name of this class or
 * the package after creating this project, you must also update the
 * build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  // Initialize Subsystems
  public static Drivetrain driveTrain = new Drivetrain();

  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private String m_teleopSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();
  private final Timer m_timer = new Timer();
  /** 
  private final Command m_simpleauto = 
  new DriveDistance(
    AutoConstants.kAutoDriveDistanceInches, AutoConstants.KAutoDriveSpeed, m_robotDrive);

  private final Command m_complexAuto = new ComplexAuto(m_robotDrive, m_hatchSubsystem);

  SendableChooser<Command> m_chooser = new SendableChooser<>();
  */



  /**
   * This function is run when the robot is first started up and should be used
   * for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
    System.out.println("Robot Init");

    CameraServer.startAutomaticCapture();

    }

  /**
   * This function is called every robot packet, no matter the mode. Use this for
   * items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and
   * test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different
   * autonomous modes using the dashboard. The sendable chooser code works with
   * the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the
   * chooser code and
   * uncomment the getString line to get the auto name from the text box below the
   * Gyro
   *
   * <p>
   * You can add additional auto modes by adding additional comparisons to the
   * switch structure
   * below with additional strings. If using the SendableChooser make sure to add
   * them to the
   * chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    m_autoSelected = kDefaultAuto;
    //m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected);
   // driveTrain.resetLeftEncoder();
   m_timer.reset();
   m_timer.start();
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    System.out.println("autonomous works");
    switch (m_autoSelected) {
 //     case kCustomAuto:
        // Put custom auto code here

 //       break;
      case kDefaultAuto:
      default:
        // Put default auto code here
        System.out.println("switch works");
        if (m_timer.get() < 2.0) {
          driveTrain.autonomousDrive(0.5, 0.0);
          System.out.println("drive works");
        } else {
          driveTrain.brake();
          System.out.println("brake works");
        }

        break;
    }

    driveTrain.joystickDrive(0.5 , 0);
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
    //driveTrain.reset();
    m_teleopSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("TeleOp selected: " + m_teleopSelected);
   // if (m_autonomousCommand != null) {
   //   m_autonomousCommand.cancel();
   //}
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    driveTrain.joystickDrive(-OI.driveStick.getY(), OI.driveStick.getX());
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {
  }

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {
  }

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {
  }

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {
  }

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {
  }

 


}
