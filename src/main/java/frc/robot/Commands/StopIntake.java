package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;

/** Stops the motion of the intake wheel. */
public class StopIntake extends InstantCommand {
    @Override
    public void initialize(){
        Robot.intake.stop();
    }
}
