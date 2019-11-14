package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import static frc.team5115.Robot.Robot.joy;

public class Intake {
    TalonSRX frontIntake;
    double intakeSpeed;
    double roboVelocity;

    public Intake(){
        frontIntake = new TalonSRX(0);
    }

    public void Inhale(){
        intakeSpeed = 0.3 + 0.3*roboVelocity;
        if(joy.getRawButtonPressed(6)){
          frontIntake.set(ControlMode.PercentOutput, intakeSpeed);
        }
    }
}
