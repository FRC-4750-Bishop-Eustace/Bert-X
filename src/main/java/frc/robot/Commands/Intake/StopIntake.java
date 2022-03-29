package frc.robot.Commands.Intake;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;

/** Stops the motion of the intake wheel. */
public class StopIntake extends InstantCommand {
    @Override
    public void initialize(){
        System.out.println("stop command ran");
        Robot.intake.stop();
    }
}
