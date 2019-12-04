package frc.team5115;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team5115.Commands.ElevateBunnies;
import frc.team5115.Commands.InhaleBalls;

public class OI {
    public static Joystick joy = new Joystick(0);
    Button intake = new JoystickButton(joy, 1);
    Button shooter = new JoystickButton(joy, 2);

    public void OI(){
        intake.whenPressed(new InhaleBalls());
        shooter.whenPressed(new ElevateBunnies());
    }
}
