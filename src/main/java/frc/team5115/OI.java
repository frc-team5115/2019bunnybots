package frc.team5115;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team5115.Commands.Drive;
import frc.team5115.Commands.ElevateBunnies;
import frc.team5115.Commands.InhaleBalls;

import static frc.team5115.Constants.INTAKE_BUTTON_ID;
import static frc.team5115.Constants.SHOOTER_BUTTON_ID;

public class OI {
    public static DualJoystick joy = new DualJoystick(0, 1);
    Button intake = new JoystickButton(joy.getOperatorJoystick(), INTAKE_BUTTON_ID);
    Button shooter = new JoystickButton(joy.getOperatorJoystick(), SHOOTER_BUTTON_ID);

    public void OI(){
        intake.whenPressed(new InhaleBalls());
        shooter.whenPressed(new ElevateBunnies());

    }
}
