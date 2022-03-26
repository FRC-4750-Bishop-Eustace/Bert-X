package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Shooter extends SubsystemBase {
    
    //Intake wheel motor
    public WPI_TalonSRX shooterMotor1 = null;
    public WPI_TalonSRX shooterMotor2 = null;
    private MotorControllerGroup group;

    //The speed at which the motor travels
    public final double shooterSpeed = +0.5;

    //Stores if the intake wheel is running, forward or in reverse.
    private boolean _isRunning = false;
    public boolean isRunning(){
        return _isRunning;
    }

    public Shooter(){
        shooterMotor1 = new WPI_TalonSRX(RobotMap.SHOOTER_1_MOTOR_ID);
        shooterMotor2 = new WPI_TalonSRX(RobotMap.SHOOTER_2_MOTOR_ID);
        
        shooterMotor1.setInverted(true);
        //shooterMotor2.setInverted(true);
        
        group = new MotorControllerGroup(shooterMotor1, shooterMotor2);
    }

    //Runs the intake wheel such that a ball can be intaken.
    public void run(){
        System.out.println("run");
        _isRunning = true;
        group.set(shooterSpeed);
    }

    //Stops the intake wheel.
    public void stop(){
        _isRunning = false;
        group.stopMotor();
    }
}
