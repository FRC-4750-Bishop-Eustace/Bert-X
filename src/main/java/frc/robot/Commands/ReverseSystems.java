package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;

//Executes the reverse commands for each subsystem that has one.
public class ReverseSystems extends InstantCommand{
    @Override
    public void initialize(){
        alongWith(
            new ReverseIntake()
        );
    }

}
