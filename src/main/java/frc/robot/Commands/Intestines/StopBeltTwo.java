package frc.robot.Commands.Intestines;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;

/** Stops the motion of the intake wheel. */
public class StopBeltTwo extends InstantCommand {
    @Override
    public void initialize(){
        Robot.intestines.stopBelt2();
    }
}
