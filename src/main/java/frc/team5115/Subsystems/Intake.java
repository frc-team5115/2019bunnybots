package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

import static frc.team5115.Constants.FRONT_INTAKE_ID;

public class Intake extends Subsystem{
    TalonSRX frontIntake;
    double intakeSpeed;
    double roboVelocity = 0.25;

    public void initDefaultCommand() {
    }

    public Intake(){
        super();
        frontIntake = new TalonSRX(FRONT_INTAKE_ID);
    }

    public void Inhale(){
        //roboVelcoity = drivetrain.getvVelocity();
        intakeSpeed = 0.3 + 0.3*roboVelocity;
        frontIntake.set(ControlMode.PercentOutput, intakeSpeed);
    }
}
