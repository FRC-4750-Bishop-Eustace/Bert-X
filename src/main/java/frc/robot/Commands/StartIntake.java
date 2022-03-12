package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;

public class StartIntake extends InstantCommand {
    @Override
    public void initialize(){
        Robot.intake.run();
    }
}
