package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import static frc.team5115.Robot.Robot.joy;

public class Shooter {
    TalonSRX Elevator;
    TalonSRX Flywheel;

    public void Shooter(){
        Elevator = new TalonSRX(3);
        Flywheel = new TalonSRX(4);
    }

    public void eject(){
        if(joy.getRawButtonPressed(7)){
            Elevator.set(ControlMode.PercentOutput, 0.5);
            Flywheel.set(ControlMode.PercentOutput, -0.5);
        }
        else{
            Elevator.set(ControlMode.PercentOutput, 0);
            Flywheel.set(ControlMode.PercentOutput, 0);
        }
    }
}
