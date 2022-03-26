package frc.robot.Commands.Intestines;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.Subsystem.Intestines;

/** Stops the motion of the intake wheel. */
public class ReverseBeltOne extends InstantCommand {

    private double _speed;

    public ReverseBeltOne(double speed){
        _speed = speed;
    }
    public ReverseBeltOne(){
        this(Intestines.BASE_BELT_SPEED);
    }

    @Override
    public void initialize(){
        Robot.intestines.runBelt1Reverse(_speed);
    }
}
