package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.RotateCart;

import static frc.team5115.Constants.CART_ID;

public class Cart extends Subsystem{
    VictorSPX Spinner;

    public Cart(){
        super();
        Spinner = new VictorSPX(CART_ID);
    }

    public void initDefaultCommand() {

        setDefaultCommand(new RotateCart());
    }

    public void Rotate(){

        Spinner.set(ControlMode.PercentOutput, 0.25);
    }
}
