package frc.robot.Commands.Intestines;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.Subsystem.Intestines;

/** Stops the motion of the intake wheel. */
public class RunBeltTwo extends InstantCommand {

    private double _speed;

    public RunBeltTwo(double speed){
        _speed = speed;
    }
    public RunBeltTwo(){
        this(Intestines.BASE_BELT_SPEED);
    }

    @Override
    public void initialize(){
        Robot.intestines.runBelt2(_speed);
    }
}
