package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import static frc.team5115.Constants.*;
import static frc.team5115.Robot.Robot.joy;

public class Intake {
    TalonSRX frontIntake;

    public Intake(){
        super();
        frontIntake = new TalonSRX(FRONT_INTAKE_ID);
    }

    public void Inhale(){
        frontIntake.set(ControlMode.PercentOutput, INTAKE_SPEED);
    }
}
