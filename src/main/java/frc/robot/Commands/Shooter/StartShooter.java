package frc.robot.Commands.Shooter;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;

public class StartShooter extends InstantCommand {
    @Override
    public void initialize(){
        Robot.shooter.run();
    }
}
