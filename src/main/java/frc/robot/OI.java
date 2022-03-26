// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.Intake.ReverseIntake;
import frc.robot.Commands.Intake.StartIntake;
import frc.robot.Commands.Intake.StopIntake;
import frc.robot.Commands.Intestines.ReverseBeltOne;
import frc.robot.Commands.Intestines.ReverseBeltTwo;
import frc.robot.Commands.Intestines.RunBeltOne;
import frc.robot.Commands.Intestines.RunBeltTwo;
import frc.robot.Commands.Intestines.StopBeltOne;
import frc.robot.Commands.Intestines.StopBeltTwo;
import frc.robot.Commands.Shooter.StartShooter;
import frc.robot.Commands.Shooter.StopShooter;
import frc.robot.Subsystem.Shooter;


public class OI {

    public static Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_PORT);
    public static Joystick controller = new Joystick(RobotMap.CONTROLSTICK_PORT);

    //The intake wheel will spin if and only if this button is held.
    public JoystickButton intakeButton = new JoystickButton(controller, RobotMap.INTAKE_BUTTON_ID);
    public JoystickButton shooterButton = new JoystickButton(controller, RobotMap.SHOOTER_HEAD_BUTTON_ID);
    // public JoystickButton reverseIntakeButton = new JoystickButton(controller, RobotMap.REVERSE_INTAKE_BUTTON_ID);
    // public JoystickButton reverseShooterButton = new JoystickButton(controller, RobotMap.REVERSE_SHOOTER_HEAD_BUTTON_ID);    

    public JoystickButton belt1Button = new JoystickButton(controller, RobotMap.BELT_1_BUTTON_ID);
    public JoystickButton belt2Button = new JoystickButton(controller, RobotMap.BELT_2_BUTTON_ID);
    public JoystickButton reverseBelt1Button = new JoystickButton(controller, RobotMap.REVERSE_BELT_1_BUTTON_ID);
    public JoystickButton reverseBelt2Button = new JoystickButton(controller, RobotMap.REVERSE_BELT_2_BUTTON_ID);


    // JoystickButton reverseButton = new JoystickButton(controller, RobotMap.REVERSE_SYSTEMS_BUTTON_ID);

    public OI(){ 

        System.out.println("init OI");
        intakeButton.whileHeld(new StartIntake());
        intakeButton.whenReleased(new StopIntake());
        
        // shooterButton.whileHeld(new StartShooter());
        // shooterButton.whenReleased(new StopShooter());

        belt1Button.whileHeld(new RunBeltOne());
        belt1Button.whenReleased(new StopBeltOne());
        
        belt2Button.whileHeld(new RunBeltTwo());
        belt2Button.whenReleased(new StopBeltTwo());

        reverseBelt1Button.whileHeld(new ReverseBeltOne());
        reverseBelt1Button.whenReleased(new StopBeltOne());

        reverseBelt2Button.whileHeld(new ReverseBeltTwo());
        reverseBelt2Button.whenReleased(new StopBeltTwo());

        reverseIntakeButton.whileHeld(new ReverseIntake());
        reverseIntakeButton.whenReleased(new StopIntake());


        // reverseButton.whileHeld(new ReverseSystems());
        // reverseButton.whenReleased(new StopSystems());
    }
}
