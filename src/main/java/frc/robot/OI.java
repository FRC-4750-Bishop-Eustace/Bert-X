// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilipj.buttons.JoystickButton;
import edu.wpi.first.wpilibj2.command.InstantCommand;
//import frc.auto.DriveToDistance;
//import frc.commands.Indexer;
//import frc.commands.ResetIndexer;
//import frc.commands.ReverseDriveTrain;
//import frc.commands.ReverseIntake;
//import frc.commands.RunClimber;
//import frc.commands.RunIntestines;
//import frc.commands.Shoot;
//import frc.commands.RunIntake;
//import frc.commands.RunShooter;
//import frc.commands.ShootDisable;
//import frc.commands.ShootEnable;
//import frc.commands.SlowModeDriveTrain;
//import frc.commands.StopClimber;
//import frc.commands.StopIntake;
//import frc.commands.StopShooter;
//import frc.subsystems.ShooterSubsystems;

/** Add your docs here. */
public class OI {
    
    //Joystick
    public static Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_PORT);
    public static Joystick controller = new Joystick(RobotMap.CONTROLSTICK_PORT);
    
    //JOYSTICK BUTTONS
    // each number is assigned to a button on the joystick or controller. In this code we assign that number to an action for the shooter.
    JoystickButton toggleDirection = new JoystickButton(driveStick, 3);
    //JoystickButton shootButton = new JoystickButton(driveStick, 6);
   // JoystickButton stopShooting = new JoystickButton(driveStick, 5);
    //JoystickButton driveStickRunClimber = new JoystickButton(driveStick, 4);
    //JoystickButton slowDriveMode = new JoystickButton(driveStick, 2);
    //edu.wpi.first.wpilibj2.command.button.JoystickButton runFeeder = new edu.wpi.first.wpilibj2.command.button.JoystickButton(driveStick, 7);
    //JoystickButton noPIDShooterButton = new JoystickButton(driveStick, 1);
    
    //controller buttons
    //JoystickButton runIntake = new JoystickButton(controller, 8);
    //JoystickButton runIndexer = new JoystickButton(controller, 7);
    //JoystickButton controllerRunClimber = new JoystickButton(controller, 2);
    //JoystickButton resetIndexer = new JoystickButton(controller, 1);
    //JoystickButton reverseIntake = new JoystickButton(controller, 3);
    
    //JoystickButton autoTest = new JoystickButton(controller ,5);
    
    public OI(){
        //buttons on the drivestick
        // this is the code for the driver joystick.
        toggle Direction.whenReleased(new ReverseDriveTrain());
        slowDriveMode.whenReleased(new SlowModeDriveTrain());
        //shootButton.whenPressed(new ShootEnable());
        //stopShooting.whenPressed(new ShootDisable());
        //noPIDShooterButton.whileHeld(new RunShooter());
        //noPIDShooterButton.whenReleased(new StopShooter());
        
        //buttons on the controller
        //runIntake.whileHeld(new RunIntake());
        //runIntake.whenReleased(new StopIntake());
        //runIndexer.whileHeld(new Indexer());
        //resetIndexer.whenPressed(new ResetIndexer());
        //controllerRunClimber.whileHeld(new RunClimber());
        //controllerRunClimber.whenReleased(new stopClimber());
        //reverseIntake.whileHeld(new ReverseIntake());
        //reverseIntake.whenReleased(new StopIntake());
        
        // test button so we don't worry about auto failing
        //autoTest.whenReleased(new DriveToDistance());
    }
}
