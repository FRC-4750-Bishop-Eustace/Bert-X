package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase{
    
    //Intake wheel motor
    public WPI_TalonSRX intakeMotor;

    //The speed at which the motor travels
    public final double intakeSpeed = +0.5;

    //Stores if the intake wheel is running, forward or in reverse.
    private boolean _isRunning = false;
    public boolean isRunning(){
        return _isRunning;
    }

    public Intake(){
        intakeMotor = new WPI_TalonSRX(RobotMap.INTAKE_MOTOR_ID);
    }

    //Runs the intake wheel such that a ball can be intaken.
    public void run(){
        System.out.println("run");
        _isRunning = true;
        intakeMotor.set(intakeSpeed);
    }

    //Stops the intake wheel.
    public void stop(){
        _isRunning = false;
        intakeMotor.stopMotor();
    }
    /**
     * Reverses the intake wheel.
     */
    public void runReverse(){
        _isRunning = true;
        intakeMotor.set(-intakeSpeed);
    }
}