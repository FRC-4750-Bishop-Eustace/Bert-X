package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase{
    
    //Intake wheel motor
    public WPI_TalonSRX intakeMotor;

    //The speed at which the motor travels
    public final double intakeSpeed = +0.5;
    //If true, then the reverse function will be able to go from spinning normally to spinning reverse. 
    //Doing this would put a ton of torque on the motor.
    private final boolean _allowImmediateReversing = false;

    private boolean _isRunning = false;
    

    public Intake(){
        intakeMotor = new WPI_TalonSRX(RobotMap.INTAKE_MOTOR_ID);
    }

    public void run(){
        System.out.println("run");
        _isRunning = true;
        intakeMotor.set(intakeSpeed);
    }
    public void stop(){
        _isRunning = false;
        intakeMotor.stopMotor();
    }
    /**
     * Reverses the intake wheel.
     * @return Returns true if the operation was successful.
     */
    public boolean runReverse(){
        if (!_isRunning || _allowImmediateReversing){
            _isRunning = true;
            intakeMotor.set(-intakeSpeed);
            return true;
        }
        return false;

    }
}
