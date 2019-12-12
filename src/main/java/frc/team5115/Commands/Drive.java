package frc.team5115.Commands;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.DualJoystick;
import frc.team5115.OI;
import frc.team5115.Robot.Robot;

import static frc.team5115.OI.joy;

public class Drive extends Command {

    Joystick driver;

    protected void initialize() {
        driver = OI.joy.getDriverJoystick();
    }

    protected void execute() {
        Robot.driveTrain.drive(driver.getRawAxis(0), driver.getRawAxis(1), driver.getRawAxis(2));
    }

    protected boolean isFinished() {
        return false;
    }
}
