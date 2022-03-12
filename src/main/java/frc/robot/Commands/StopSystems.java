package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;

//Executes the stop commands for each subsystem that has one.
public class StopSystems extends InstantCommand{
    @Override
    public void initialize(){
        alongWith(
            new StopIntake()
        );
    }

}
