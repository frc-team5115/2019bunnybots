package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.StopShooter;
import frc.team5115.Constants;

import static frc.team5115.Constants.ELEVATOR_ID;
import static frc.team5115.Constants.FLYWHEEL_ID;

public class Shooter extends Subsystem{
    VictorSPX Elevator;
    TalonSRX Flywheel;

    public void initDefaultCommand() {
        setDefaultCommand(new StopShooter());
    }

    public Shooter() {
        Elevator = new VictorSPX(ELEVATOR_ID);
        Flywheel = new TalonSRX(FLYWHEEL_ID);

        Flywheel.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, Constants.kPIDLoopIdx, Constants.kTimeoutMs);

        Flywheel.setSensorPhase(true);

        Flywheel.configNominalOutputForward(0, Constants.kTimeoutMs);
        Flywheel.configNominalOutputReverse(0, Constants.kTimeoutMs);
        Flywheel.configPeakOutputForward(1, Constants.kTimeoutMs);
        Flywheel.configPeakOutputReverse(-1, Constants.kTimeoutMs);

        Flywheel.config_kF(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kF, Constants.kTimeoutMs);
        Flywheel.config_kP(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kP, Constants.kTimeoutMs);
        Flywheel.config_kI(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kI, Constants.kTimeoutMs);
        Flywheel.config_kD(Constants.kPIDLoopIdx, Constants.kGains_Velocit.kD, Constants.kTimeoutMs);

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

        double motorOutput = Elevator.getMotorOutputPercent();
    }
    public void eject(){
        double targetVelocity = 1000; //496 ticks per revelution
        Elevator.set(ControlMode.Velocity, -targetVelocity);
        Flywheel.set(ControlMode.Velocity, targetVelocity);

    }

     public void stop(){
            Elevator.set(ControlMode.PercentOutput, 0);
            Flywheel.set(ControlMode.PercentOutput, 0);
        }
}

