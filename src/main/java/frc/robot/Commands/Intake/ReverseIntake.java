package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;

/**
 * Attempts to reverse the intake motor. Prints a message to the console if it cannot.
 */
public class ReverseIntake extends InstantCommand {
    @Override
    public void initialize(){
        if (!Robot.intake.runReverse()){
            System.out.println("Reverse operation failed. Stop the motor first.");
        }
    }
}
