package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intestines extends SubsystemBase {
    
    public WPI_TalonSRX beltMotor_1;
    public WPI_TalonSRX beltMotor_2;

    public static final double BASE_BELT_SPEED = +0.25;

    //Stores whether the belts are running
    private boolean _belt1Running = false;
    private boolean _belt2Running = false;
    public boolean isBelt1Running(){
        return _belt1Running;
    }
    public boolean isBelt2Running(){
        return _belt2Running;
    }

    public Intestines(){
        beltMotor_1 = new WPI_TalonSRX(RobotMap.BELT_MOTOR_1_ID);
        beltMotor_2 = new WPI_TalonSRX(RobotMap.BELT_MOTOR_2_ID);
    }

    //Runs the first belt
    public void runBelt1(double speed){
        _belt1Running = true;
        beltMotor_1.set(speed);
    }
    //Runs the second belt
    public void runBelt2(double speed){
        _belt2Running = true;
        beltMotor_2.set(speed);
    }
    //Stops the first belt
    public void stopBelt1(){
        _belt1Running = false;
        beltMotor_1.set(0);
    }
    //Stops the second belt
    public void stopBelt2(){
        _belt2Running = false;
        beltMotor_2.set(0);
    }
    //Runs the first belt in reverse
    public void runBelt1Reverse(double speed){
        _belt1Running = true;
        beltMotor_1.set(-speed);
    }
    //Runs the second belt in reverse
    public void runBelt2Reverse(double speed){
        _belt2Running = true;
        beltMotor_2.set(-speed);
    }
    
    

}
