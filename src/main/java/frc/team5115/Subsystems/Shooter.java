package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import static frc.team5115.Constants.*;
import static frc.team5115.Robot.Robot.joy;

public class Shooter{
    VictorSPX Elevator;
    TalonSRX Flywheel;

    public Shooter() {
        Elevator = new VictorSPX(ELEVATOR_ID);
        Flywheel = new TalonSRX(FLYWHEEL_ID);

//        Flywheel.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
//
//        Flywheel.setSensorPhase(true);

        /* Config the peak and nominal outputs */
//        Flywheel.configNominalOutputForward(0, Constants.kTimeoutMs);
//        Flywheel.configNominalOutputReverse(0, Constants.kTimeoutMs);
//        Flywheel.configPeakOutputForward(1, Constants.kTimeoutMs);
//        Flywheel.configPeakOutputReverse(-1, Constants.kTimeoutMs);
        /* Config the Velocity closed loop gains in slot0 */

//        Flywheel.config_kP(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kP);
//        Flywheel.config_kI(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kI);
//        Flywheel.config_kD(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kD);

//        Elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, Constants.kPIDLoopIdx, Constants.kTimeoutMs);
//
//        Elevator.setSensorPhase(true);
//
//        Elevator.configNominalOutputForward(0, Constants.kTimeoutMs);
//        Elevator.configNominalOutputReverse(0, Constants.kTimeoutMs);
//        Elevator.configPeakOutputForward(1, Constants.kTimeoutMs);
//        Elevator.configPeakOutputReverse(-1, Constants.kTimeoutMs);
//
//        Elevator.config_kF(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kF, Constants.kTimeoutMs);
//        Elevator.config_kP(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kP, Constants.kTimeoutMs);
//        Elevator.config_kI(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kI, Constants.kTimeoutMs);
//        Elevator.config_kD(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kD, Constants.kTimeoutMs);

       // double motorOutput = Elevator.getMotorOutputPercent();
    }
    public void eject(){
        //if(OI.joy.getDriverJoystick().getRawButton(1))
        if(joy.getRawButtonPressed(SHOOTER_BUTTON_ID)){
//            double targetVelocity = 1500; //496 ticks per revelution
//            Elevator.set(ControlMode.Velocity, -targetVelocity);
//            Flywheel.set(ControlMode.Velocity, targetVelocity);
//            System.out.println(Flywheel.getSelectedSensorVelocity());

            Flywheel.set(ControlMode.PercentOutput, SHOOTER_SPEED);
            Elevator.set(ControlMode.PercentOutput, ELEVATOR_SPEED);
        }
        else{
            Elevator.set(ControlMode.PercentOutput, 0);
            Flywheel.set(ControlMode.PercentOutput, 0);
        }
        }



     public void stop(){
            Elevator.set(ControlMode.PercentOutput, 0);
            Flywheel.set(ControlMode.PercentOutput, 0);
        }
}

