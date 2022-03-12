// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Intestines extends SubsystemBase {
  /** Creates a new Intestines. */

  //create motors 
  WPI_TalonSRX beltOneMotor = null;
  WPI_TalonSRX beltTwoMotor = null;

  //create IR senors
  public DigitalInput IR1, IR2;

  //when true there is something in the sensor
  boolean IR1State = false; 
  boolean IR2State = false; //will set to true before match for preloading purposes
  boolean PreviousIR1State = false;
  boolean PreviousIR2State = false;

  boolean IR1HasChanged = false;
  boolean IR2HasChanged = false;
  

  //test constant
  //anythig with this vakue need to be tested
  double test = .1;

 
  public Intestines() {

    //init motors
    beltOneMotor = new WPI_TalonSRX(RobotMap.BELT_ONE_MOTOR_ID);
    beltTwoMotor = new WPI_TalonSRX(RobotMap.BELT_TWO_MOTOR_ID);

    //init digital inputs
    IR1 = new DigitalInput(RobotMap.IR_SENSOR_ONE);
    IR2 = new DigitalInput(RobotMap.IR_SENSOR_TWO);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //this is a test for teh IR method, if it works copy paste and edit for IR2
    System.out.println(getIR1());

  }

  public void RunBeltOne(double speed){
    beltOneMotor.set(test);
  }

  public void RunBeltTwo(){
    beltTwoMotor.set(test);
  }

  public void StopBeltOne(double speed){
    System.out.println("this is what belt one is doing " + beltOneMotor.get());
    beltOneMotor.set(0);
  }

  public void StopBeltTwo(double speed){
    System.out.println("this is what belt two is doing " + beltTwoMotor.get());
    beltTwoMotor.set(0);
  }

  public void ReverseBeltOne(){
    if(beltOneMotor.get() > 0){
      beltOneMotor.set(0);
      beltOneMotor.set(-test);
    } else{
      beltOneMotor.set(-test);
    }
  }

  public void ReverseBeltTwo(){
    if(beltTwoMotor.get() > 0){
      beltTwoMotor.set(0);
      beltTwoMotor.set(-test);
    } else{
      beltTwoMotor.set(-test);
    }
  }

  public boolean getIR1(){
  PreviousIR1State = IR1State;
  IR1State = IR1.get();
  if(IR1State == PreviousIR1State){
    IR1HasChanged = false;
  }else{ //IR1State != PreviousIRState
    IR1HasChanged = true;
  }

  System.out.println(IR1HasChanged);
  return IR1State;
  }

}
