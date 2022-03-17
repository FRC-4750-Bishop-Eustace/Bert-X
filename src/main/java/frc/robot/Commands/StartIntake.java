package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;
/**Starts the motion of the intake wheel. */
public class StartIntake extends InstantCommand {
    @Override
    public void initialize(){
        System.out.println("command ran");
        Robot.intake.run();
    }
}