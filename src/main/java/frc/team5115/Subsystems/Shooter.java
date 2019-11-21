package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.StopShooter;

public class Shooter extends Subsystem{
    VictorSPX Elevator;
    TalonSRX Flywheel;

    public void initDefaultCommand() {
        setDefaultCommand(new StopShooter());
    }

    public void Shooter(){
        Elevator = new VictorSPX(3);
        Flywheel = new TalonSRX(4);
    }

    public void eject() {
        Elevator.set(ControlMode.PercentOutput, 0.5);
        Flywheel.set(ControlMode.PercentOutput, -0.5);
    }

     public void stop(){
            Elevator.set(ControlMode.PercentOutput, 0);
            Flywheel.set(ControlMode.PercentOutput, 0);
        }
}

