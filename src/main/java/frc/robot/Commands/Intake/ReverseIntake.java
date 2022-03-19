package frc.robot.Commands.Intake;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;

/**
 * Attempts to reverse the intake motor. Prints a message to the console if it cannot.
 */
public class ReverseIntake extends InstantCommand {
    @Override
    public void initialize(){
        Robot.intake.runReverse();
    }
}
