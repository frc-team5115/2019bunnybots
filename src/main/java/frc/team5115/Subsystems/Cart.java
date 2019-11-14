package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Cart {
    TalonSRX Spinner;

    public Cart(){
        Spinner = new TalonSRX(1);
    }

    public void Rotate(){
        Spinner.set(ControlMode.PercentOutput, 0.25);
    }
}
